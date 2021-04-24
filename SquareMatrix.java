import java.util.Random;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.stage.Stage;
import static javafx.application.Application.launch;


public class SquareMatrix extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane gpane = new GridPane();           
        StackPane[] stackPane   = new StackPane[100];     
        Rectangle[] rect  = new Rectangle[100];     
        Text[]      texts = new Text[100];          

        int row = 0;
        int index = 0;
        int column = 0;
        
        for(index=0; index<100; index++){
            stackPane[index]   = new StackPane();                         
            rect[index]  = new Rectangle();
            texts[index] = new Text();
            
            rect[index].setWidth(30);                          
            rect[index].setHeight(30);
            rect[index].setFill(Color.color(Math.random(), Math.random(), Math.random()));
            rect[index].setOpacity(0.5);
            
            Random random = new Random();     
            
            texts[index].setText( Integer.toString(random.nextInt(101)) );
            texts[index].setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.REGULAR, 12));
            stackPane[index].getChildren().addAll(rect[index], texts[index]);  
            gpane.add(stackPane[index], column++, row);
            
            if(column > 9){                                   
                row++;
                column = 0;
            }
        }
        
        Scene scene = new Scene(gpane, 300, 300);   
        primaryStage.setTitle("10 by 10 matrix");  
        primaryStage.setScene(scene);               
        primaryStage.show();                        
    }
    

}