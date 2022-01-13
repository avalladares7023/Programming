package checkerboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application 
{
    public void start(Stage primaryStage) 
    {
        Pane pane = new Pane();
        
        Rectangle board = new Rectangle(20, 20, 600, 600);
        board.setFill(Color.BLACK);
        board.setStroke(Color.BLACK);
        pane.getChildren().add(board);

        for(int row = 0; row< 8; row++)
        {
            for(int column = 0; column < 8; column++)
            {
                if( row %2 == column %2)
                {
                    int x = 20 + column * 75;
                    int y = 20 + row * 75;
                    Rectangle rectangle = new Rectangle(x, y, 75, 75);
                    rectangle.setFill(Color.WHITE);
                    pane.getChildren().add(rectangle);
                }
            }
        }

        Scene scene = new Scene(pane, 650, 650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkerboard");
        primaryStage.show();

    }
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
}
