package pokemon;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TrainerClient extends Application{
	private TextField textName = new TextField();
	private String[] pokemonTypes = {"Bulbasaur", "Charmander", "Squirtle", "Pikachu"};
	private ComboBox<String> comboPokemon = 
			new ComboBox<String>(FXCollections.observableArrayList(pokemonTypes));
	private Button buttonSend = new Button("Send to Day Care");
	private Button buttonPickUp = new Button("Pick Up from Day Care");
	private ObjectOutputStream toServer = null;
	private Pokemon pokemon = null;
	
	@Override
	public void start(Stage primaryStage) {
		CreateStage(primaryStage);
		ConnectToServer();
	}
	
	private void ConnectToServer() {
		try {
			Socket socket = new Socket("localhost", 8000);
			toServer = new ObjectOutputStream(socket.getOutputStream());
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private void CreateStage(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.add(new Label("Choose a Pokemon Type: "), 0, 0);
		pane.add(comboPokemon, 1, 0);
		pane.add(new Label("Pokemon's Name: "), 0, 1);
		pane.add(textName, 1, 1);
		pane.add(buttonSend, 0, 2);
		pane.add(buttonPickUp, 1, 2);
		
		buttonSend.setOnAction(e -> {
			SendToDayCare();
		});
		
		buttonPickUp.setOnAction(e -> {
			PickUpFromDayCare();
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pokemon Day Care");
		primaryStage.show();
	}

	private void PickUpFromDayCare() {
		pokemon.checkOut();
		try {
			toServer.writeObject(pokemon);
			pokemon = null;
		} catch (IOException e) {
			e.printStackTrace();
		}		
		buttonSend.setDisable(false);
		buttonPickUp.setDisable(true);
	}

	private void SendToDayCare() {
		try {
			String pokemonType = comboPokemon.getValue().toString();
			pokemon = new Pokemon(pokemonType, textName.getText().trim());
			pokemon.checkIn();
			toServer.writeObject(pokemon);
			toServer.flush();
			toServer.reset();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		buttonSend.setDisable(true);
		buttonPickUp.setDisable(false);
	}

	public static void main(String args[]) {
		Application.launch(args);
	}
}
