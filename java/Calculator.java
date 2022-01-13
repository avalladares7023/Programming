package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Calculator extends Application
{
	TextField textDisplay = new TextField();
	double data = 0;
	int operation = 1;
	
	@Override
	public void start(Stage primaryStage)
	{		
		BorderPane pane = new BorderPane();
		
		pane.setTop(getHBox());
		pane.setCenter(getGridPane());
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.show();
	}
	
	public HBox getHBox()
	{
		HBox hBox = new HBox();
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5, 5));
		
		textDisplay.setPrefWidth(300);
		textDisplay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		
		hBox.getChildren().add(textDisplay);
		
		return hBox;
	}
	
	public GridPane getGridPane()
	{
		GridPane gridPane = new GridPane();
		
		//Styling
		for(int row = 0; row < 4; row++)
		{
			RowConstraints rc = new RowConstraints();
			rc.setFillHeight(true);
			rc.setVgrow(Priority.ALWAYS);
			gridPane.getRowConstraints().add(rc);
		}
		
		for(int column = 0; column < 4; column++)
		{
			ColumnConstraints cc = new ColumnConstraints();
			cc.setFillWidth(true);
			cc.setHgrow(Priority.ALWAYS);
			gridPane.getColumnConstraints().add(cc);
		}
		
		for(int i = 0; i < 9; i++)
		{
			gridPane.add(createButton(Integer.toString(i + 1)), i%3, i/3);
		}
		
		gridPane.add(createButton("0"), 0, 3);
		gridPane.add(createButton("="), 1, 3);
		gridPane.add(createButton("CLR"), 2, 3);
		
		gridPane.add(createButton("+"), 3, 0);
		gridPane.add(createButton("-"), 3, 1);
		gridPane.add(createButton("*"), 3, 2);
		gridPane.add(createButton("/"), 3, 3);
		
		return gridPane;
	}
	
	public Button createButton(String text)
	{
		Button button = new Button(text);
		button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		button.setOnAction((ActionEvent e) -> {handleButtonAction(text);});
		
		return button;
	}
	
	public void handleButtonAction(String source)
	{
	try {
		if(source == "+") {
			data = Double.parseDouble(textDisplay.getText());
			operation = 1;
			textDisplay.setText("");
		} else if(source == "-") {
			data = Double.parseDouble(textDisplay.getText());
			operation = 2;
			textDisplay.setText("");
		} else if(source == "*") {
			data = Double.parseDouble(textDisplay.getText());
			operation = 3;
			textDisplay.setText("");
		} else if(source == "/") {
			data = Double.parseDouble(textDisplay.getText());
			operation = 4;
			textDisplay.setText("");
		}	else if(source == "=") {
			double secondData = Double.parseDouble(textDisplay.getText());
			String result = "";
			switch(operation) {
			case 1:
				result = String.valueOf(data + secondData);
				break;
			case 2:
				result = String.valueOf(data - secondData);
				break;
			case 3:
				result = String.valueOf(data * secondData);
				break;
			case 4:
				result = String.valueOf(data / secondData);
				break;
			} 			
			textDisplay.setText(result);
		} else if (source == "CLR") {
			data = 0;
			operation = 0;
			textDisplay.setText("");
		} else {
			int result = Integer.parseInt(source);
			textDisplay.setText(textDisplay.getText() + result);
		} 
		
		}catch(NumberFormatException ex) {
			textDisplay.setText("Error");
		}
	}
	
	public static void main(String args[])
	{
		Application.launch(args);
	}
}
