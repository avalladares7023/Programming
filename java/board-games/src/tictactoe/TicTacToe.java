package tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application 
{
	public void start(Stage primaryStage) 
	{
		GridPane pane = new GridPane();
		
		pane.setPadding(new Insets(10, 20, 10, 20));
		pane.setAlignment(Pos.CENTER);
		
		for(int i = 0; i < 9; i++)
		{
			pane.add(setImage(), i % 3, i /3);
		}
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setTitle("Tic-Tac-Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public ImageView setImage()
	{
		Image xPic = new Image("/resources/x.gif");
		Image oPic = new Image("/resources/o.gif");
		Image wPic = new Image("/resources/w.GIF");
		
		ImageView xView = new ImageView(xPic);
		ImageView oView = new ImageView(oPic);
		ImageView wView = new ImageView(wPic);
		
		wView.setFitHeight(40);
		wView.setFitWidth(40);
		
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1)
		{
			return xView;
		}
		else if(random == 2)
		{
			return oView;
		}
		else
		{
			return wView;
		}
	}
	
	public static void main(String args[]) 
	{
		Application.launch(args);
	}
}
