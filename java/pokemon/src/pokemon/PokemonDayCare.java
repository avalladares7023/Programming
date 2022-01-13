package pokemon;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PokemonDayCare extends Application{
	private TextArea textArea = new TextArea();
	private ServerSocket serverSocket = null;
	private int connections = 0;

	@Override
	public void start(Stage primaryStage) {
		ConstructDayCare(primaryStage);
		ConstructServer();
	}

	private void ConstructServer() {
		new Thread(() -> {
			try {
				serverSocket = new ServerSocket(8000);
				Platform.runLater(() -> {
					textArea.appendText("Server started at " + new Date() + "\n");
				});
				while (true) {
					Socket socket = serverSocket.accept();
					connections++;
					Platform.runLater(() -> {
						textArea.appendText(
								"New connection made with trainer. Total connetions =  " + connections + "\n");
					});

					new Thread(() -> {
						HandleTrainer(socket);
					}).start();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				CloseSocket();
			}
		}).start();
	}

	private void HandleTrainer(Socket socket) {
		try {
			InetAddress inetAddress = socket.getInetAddress();
			Platform.runLater(() -> {
				textArea.appendText("Trainer's IP Address is  " + inetAddress.getHostAddress() + "\n");
			});
			ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
			while (true) {
				Object obj = inputFromClient.readObject();
				if (obj instanceof Pokemon) {
					Pokemon p = (Pokemon) obj;
					Platform.runLater(() -> {
						String pokemonState = p.isCheckedIn() ? "checked in" : "checked out";
						textArea.appendText("Pokemon " + p.getName() + " has been " + pokemonState + ".\n");
					});
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			connections--;
		}
	}

	private void CloseSocket() {
		if (serverSocket != null) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void ConstructDayCare(Stage primaryStage) {
		Scene scene = new Scene(new ScrollPane(textArea));
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pokemon Day Care");
		primaryStage.show();
		primaryStage.setOnCloseRequest(e -> {
			CloseSocket();
			Platform.exit();
			System.exit(0);
		}); // Makes it let go of the connection
	}

	public static void main(String args[]) {
		Application.launch(args);
	}
}
