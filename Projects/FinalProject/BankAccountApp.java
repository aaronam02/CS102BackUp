package FinalProject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

//************************************************************************
//  BankAccountApp.java       Author: Aaron Amankwaah /Loftus
//  11/23/2020
//  Makes Home Page With Buttons.
//************************************************************************

public class BankAccountApp extends Application{

Scene scene1, scene2, scene3, scene4, scene5;
// Scene scene1, scene2;
@Override
public void start(Stage primaryStage) {
        
primaryStage.setTitle("Bank Account GUI");

//Scene 1
Label label1= new Label("Bank Actions");
Button button1= new Button("Deposit");
button1.setOnAction(e -> primaryStage.setScene(scene2));   
Button button2= new Button("Withdraw");
button2.setOnAction(e -> primaryStage.setScene(scene3)); 
Button button3= new Button("Balance Inquiry");
button3.setOnAction(e -> primaryStage.setScene(scene4)); 
Button button4= new Button("Mini Statement");
button4.setOnAction(e -> primaryStage.setScene(scene5)); 
 
VBox layout1 = new VBox(20);     
layout1.getChildren().addAll(label1, button1, button2, button3, button4);
scene1= new Scene(layout1, 500, 500);

//return to Bank Actions, applicaple in all scenes
// Button buttonBack= new Button("Back To Bank Actions");
// buttonBack.setOnAction(e -> primaryStage.setScene(scene1));
               
//Scene 2
//user deposit money
Label label2= new Label("Deposit Money");

Button buttonBack1= new Button("Back To Bank Actions");
buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout2= new VBox(20);
layout2.getChildren().addAll(label2, buttonBack1);
scene2= new Scene(layout2,500,500);



//Scene 3
//user withdraw amount
Label label3= new Label("Withdraw Money?");
Button buttonBack2= new Button("Back To Bank Actions");
buttonBack2.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout3= new VBox(20);
layout3.getChildren().addAll(label3, buttonBack2);
scene3= new Scene(layout3,500,500);

//Scene 4
//display current balance
Label label4= new Label("Balance Inquiry");
Button buttonBack3= new Button("Back To Bank Actions");
buttonBack3.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout4= new VBox(20);
layout4.getChildren().addAll(label4, buttonBack3);
scene4= new Scene(layout4,500,500);

//Scene 5
//print bank statement info
Label label5= new Label("Mini Statement");
Button buttonBack4= new Button("Back To Bank Actions");
buttonBack4.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout5= new VBox(20);
layout5.getChildren().addAll(label5, buttonBack4);
scene5= new Scene(layout5,500,500);
     
primaryStage.setScene(scene1);
primaryStage.show();
}

public static void main(String[] args) {
launch(args);
}

}

