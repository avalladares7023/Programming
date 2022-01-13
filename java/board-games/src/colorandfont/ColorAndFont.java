package colorandfont;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ColorAndFont extends Application 
{

	@Override
	public void start(Stage primaryStage) 
	{
		HBox hBox = new HBox();
		
		for(int i = 0; i < 5; i++)
		{
			Color color = new Color(Math.random(), Math.random(), Math.random(), Math.random());
			Label label = new Label("Java");
			label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			label.setRotate(90);
			label.setTextFill(color);
			label.setPadding(new Insets(8, 8, 8, 8));
			hBox.getChildren().add(label);
		}
		
		hBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(hBox, 300, 100);
		primaryStage.setTitle("Color and Font");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		Application.launch(args);
	}
	
}
