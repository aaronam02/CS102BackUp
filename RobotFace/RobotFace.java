import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;


//************************************************************************
//  RobotFace.java       Author: Lewis/Loftus
//
//  Presents the face of a robot.
//************************************************************************

public class RobotFace extends Group
{
    //--------------------------------------------------------------------
    //  Sets up the elements that make up the robots face, positioned
    //  in the upper left corner of the coordinate system.
    //--------------------------------------------------------------------
    public RobotFace()
    {
        Circle head = new Circle(55, 25, 50);
        head.setFill(Color.SILVER);
        
        Rectangle ears = new Rectangle(0, 20, 110, 30);
        ears.setFill(Color.DARKBLUE);
        ears.setArcHeight(10);
        ears.setArcWidth(10);

        Circle eye1 = new Circle(30, 15, 10);
        eye1.setFill(Color.GOLD);
        
        Circle eye2 = new Circle(80, 15, 10);
        eye2.setFill(Color.GOLD);
        
        Rectangle nose = new Rectangle(52, 25, 6, 15);
        nose.setFill(Color.BLACK);
        
        Rectangle mouth1 = new Rectangle(35, 45, 40, 10);
        mouth1.setFill(Color.RED);
        
        Rectangle mouth2 = new Rectangle(35, 58, 40, 10);
        mouth2.setFill(Color.RED);

        
        getChildren().addAll(ears, head, eye1, eye2, nose, mouth1, mouth2);        
    }    
}