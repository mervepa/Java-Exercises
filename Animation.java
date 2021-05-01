import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Week10_HW extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        double width = 600;
        double height = 600;
        Scene scene = new Scene(pane, width, height);
        double radius = Math.min(width, height) * 0.25;
        Circle c = new Circle(width / 2, height / 2, radius, Color.TRANSPARENT);
	c.setStroke(Color.RED);
        c.setRotate(180);
        Text text = new Text("MERVE PARLAK");
	Font font = Font.font("Calibri", FontWeight.BOLD,FontPosture.ITALIC,24);
        text.setFont(font);       
        
        
        PathTransition pathTransition = new PathTransition();//1. Create a path transition.         
        pathTransition.setDuration(Duration.millis(10000));//2. Set the duration of this animation as 10000       
        pathTransition.setPath(c);//3. The path will be the circle     
        pathTransition.setNode(text); //4. The node will be the text      
        pathTransition.setCycleCount(Timeline.INDEFINITE);//5. The animation will cycle indefinite number of cycles      
        pathTransition.setAutoReverse(true);//6. The animation will automatically reverse       
        pathTransition.play();//7. Start the path transition

         
       
        FadeTransition fade = new FadeTransition();   //8. Create a fade transition on the text      
        fade.setDuration(Duration.millis(5000)); //9. Set the duration of this animation as 5000       
        fade.setNode(text);//10. The node will be the text       
        fade.setToValue(0.0);//11. The animation fade value will change from 1.0 to 0.0      
        fade.setCycleCount(Timeline.INDEFINITE); //12. The animation will cycle indefinite number of cycles      
        fade.setAutoReverse(true);//13. The animation will automatically reverse     
        fade.play();//14. Start the fade transition
       
        //15. When the mouse is pressed on the pane both of the animations should pause
        c.setOnMousePressed(e -> {
            pathTransition.pause();
            fade.pause();
                });
       
        //16. When the mouse is released from the pane both of the animations will continue to play
        c.setOnMouseExited(e -> {
            pathTransition.play();
            fade.play();
                });

        pane.getChildren().addAll(text,c);
        primaryStage.setScene(scene);
        primaryStage.setTitle("WEEK 10-HW");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}