public class Server extends Application{
    public int connections = 0;
    private ServerSocket serverSocket = null;
    DataOutputStream outputToClient;

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();
        
        Scene scene = new Scene(new ScrollPane(textArea), 450, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Server");
        primaryStage.show();
        
        new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(8006);
                Platform.runLater(() -> {
                    textArea.appendText("Server started at " + new Date() + "\n");
                });
                while(true) {
                    Socket socket = serverSocket.accept();
                    connections++;
                    DataOutputStream outputToClient = new
                    DataOutputStream(socket.getOutputStream());
                    outputToClient.writeInt(connections);
                    InetAddress inetAddress = socket.getInetAddress();
                    Platform.runLater(() -> {
                        textArea.appendText("Client IP " + inetAddress + "connected to server. Total visitors = " + connections + "\n");
                    });
                }
            } catch(IOException ex) {
                ex.printStackTrace();
            } finally {
                CloseSocket();
            }
        }).start();
    }

    private void CloseSocket() {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Application.launch(args);
    }
}

public class Client extends Application {
    DataInputStream fromServer;

    @Override
    public void start(Stage primaryStage){
        TextArea textArea = new TextArea();
        Scene scene = new Scene(new ScrollPane(textArea), 450, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Client");
        primaryStage.show();
        
        try {
            Socket socket = new Socket("localhost", 8006);
            fromServer = new DataInputStream(socket.getInputStream());
            textArea.appendText("You are visitor #" + fromServer.readInt() + "\n");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Application.launch(args);
    }
}