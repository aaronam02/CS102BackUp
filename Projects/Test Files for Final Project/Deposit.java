package FinalProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javafx.scene.control.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Deposit extends BankAccountApp  {
  //Checking accountTest = new Checking("Jemmy", "8644140827",9000006, 0);

   Button depBtn = null;
   TextField depAmnt = null;
   Label accountNumLabel = null;

   
   public void Deposit(Stage primaryStage) throws Exception {

      primaryStage.setTitle("Deposit Into Account");
       depBtn = new Button("Deposit In Account");
       depAmnt = new TextField();
        //int amnt =  (int) depAmnt;// 
       accountNumLabel = new Label("Enter Amount To Deposit ");
       

       VBox vb = new VBox(accountNumLabel, depAmnt, depBtn);
       vb.setSpacing(10);
       vb.setPadding(new Insets(20));

       FlowPane root = new FlowPane();
       root.getChildren().add(vb);

       // usual code at the end of start
       Scene scene = new Scene(root, 300, 250);

       primaryStage.setScene(scene);

       depBtn.setOnAction(e -> deposit(depAmnt));
       primaryStage.show();

   }

   public void deposit(TextField amt ) {
     
      //  Button b = (Button) event.getSource();
//        System.err.println("[ hello ]");
//        csvReader();
   }

   public static void main(String[] args) {
       Application.launch(args);
   }




}

