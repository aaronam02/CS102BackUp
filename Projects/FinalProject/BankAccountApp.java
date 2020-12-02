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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

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
    
    private BankAccount account1 = new BankAccount("Thomas", "504020", 5000, 2.5);
    private Checking account2 = new Checking("Jane", "86443620845",10000, 0.15);

public Scene scene1, scene2, scene3, scene4, scene5;
// Scene scene1, scene2;
@Override
public void start(Stage primaryStage) {
        
primaryStage.setTitle("Bank Account GUI");

//Scene 1

Label label1= new Label("Bank Actions");
Button button1= new Button("Deposit");
button1.setOnAction(e -> Deposit(primaryStage)); 
Button button2= new Button("Withdraw");
button2.setOnAction(e -> Withdraw(primaryStage)); 
Button button3= new Button("Balance Inquiry");
button3.setOnAction(e -> BalanceInquiry(primaryStage)); 
Button button4= new Button("Mini Statement");
button4.setOnAction(e -> MiniStatement(primaryStage)); 
 
VBox layout1 = new VBox(20);     
layout1.getChildren().addAll(label1, button1, button2, button3, button4);
scene1= new Scene(layout1, 500, 500);

//return to Bank Actions, applicaple in all scenes
// Button buttonBack= new Button("Back To Bank Actions");
// buttonBack.setOnAction(e -> primaryStage.setScene(scene1));
               
//Scene 2
//user deposit money
// Label label2= new Label("Deposit Money");
// Button buttonBack1= new Button("Back To Bank Actions");
// buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
// VBox layout2= new VBox(20);
// layout2.getChildren().addAll(label2, buttonBack1);
// scene2= new Scene(layout2,500,500);


//Scene 3
//user withdraw amount
// Label label3= new Label("Withdraw Money?");
// Button buttonBack2= new Button("Back To Bank Actions");
// buttonBack2.setOnAction(e -> primaryStage.setScene(scene1));
// VBox layout3= new VBox(20);
// layout3.getChildren().addAll(label3, buttonBack2);
// scene3= new Scene(layout3,500,500);

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

public void Deposit(Stage primaryStage){// to deposit money
   Button depBtn = null;
   //TextField depAmnt = null;
   Label accountNumLabel = null;
   depBtn = new Button("Deposit In Account");
   //depAmnt = new TextField();
   TextArea areaInfo = new TextArea();
   TextField depAmnt = new TextField();

   //int amnt =  (int) depAmnt;// 
   accountNumLabel = new Label("Enter Amount To Deposit ");
   
   VBox vb = new VBox(accountNumLabel, depAmnt, depBtn);
   vb.setSpacing(10);
   vb.setPadding(new Insets(20));
   
   FlowPane root = new FlowPane();
   root.getChildren().add(vb);

   Label label2= new Label("Deposit Money");
   Button buttonBack1= new Button("Back To Bank Actions");
   buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
   VBox layout2= new VBox(20);
   
   layout2.getChildren().addAll(label2, depAmnt, depBtn, buttonBack1,areaInfo );
   scene2= new Scene(layout2,500,500);
   
   primaryStage.setTitle("Deposit Into Account");
          //depBtn.setOnAction(e -> primaryStage.setScene(scene1));//change to an anction so that it deposits money!
         //depBtn.setOnAction(e -> deposit(depAmnt));
           //Button btnDeposit = new Button("Deposit");
        depBtn.setOnAction(e -> {
            double amount = Integer.parseInt(depAmnt.getText());
            account2.deposit(amount);
             
            areaInfo.setText("Your new balance is: $" + account2.balance);

            //areaInfo.setText(account.toString());
        });
        
        
   primaryStage.setScene(scene2);
   primaryStage.show();
}

public void Withdraw(Stage primaryStage){// to withdraw money
   Button withdrawBtn = null;
    TextArea areaInfo = new TextArea();
   //TextField withdrawAmnt = null;
   Label accountNumLabel = null;
   withdrawBtn = new Button("Withdraw From Account");
   //withdrawAmnt = new TextField();
   TextField withdrawAmnt = new TextField();

   
   //int amnt =  (int) depAmnt;// 
   accountNumLabel = new Label("Enter Amount To Withdraw ");
   
   VBox vb = new VBox(accountNumLabel, withdrawAmnt, withdrawBtn);
   vb.setSpacing(30);
   vb.setPadding(new Insets(20));
   FlowPane root = new FlowPane();
   root.getChildren().add(vb);
   Label label2= new Label("Withdraw Money");
   Button buttonBack1= new Button("Back To Bank Actions");
   buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
   VBox layout2= new VBox(20);
   
   layout2.getChildren().addAll(label2, withdrawAmnt, withdrawBtn, buttonBack1 , areaInfo);
   scene2= new Scene(layout2,500,500);
   primaryStage.setTitle("Withdraw From Account");
   //depBtn.setOnAction(e -> withdraw(withdrawAmnt));
   //withdrawBtn.setOnAction(e -> primaryStage.setScene(scene1));//change to an anction so that it deposits money!
    withdrawBtn.setOnAction(e -> {
            double amount = Integer.parseInt(withdrawAmnt.getText());
            account2.withdraw(amount);
             
            areaInfo.setText("Your new balance is: $" + account2.balance);

            //areaInfo.setText(account.toString());
        });

   
   primaryStage.setScene(scene2);
   primaryStage.show();
}

public void BalanceInquiry(Stage primaryStage){// to ballance inquiry money
   Button balInquiryBtn = null;
   Label accountNumLabel = null;
   TextArea areaInfo = new TextArea();

   balInquiryBtn = new Button("Balance Inquiry Of Account");

   //int wAmnt =  (int) withdrawAmnt;// 
   accountNumLabel = new Label("Inquire Balance ");
   
   VBox vb = new VBox(accountNumLabel, balInquiryBtn);
   vb.setSpacing(10);
   vb.setPadding(new Insets(20));
   FlowPane root = new FlowPane();
   root.getChildren().add(vb);
   Label label2= new Label("Balance Of Inquiry ");
   Button buttonBack1= new Button("Back To Bank Actions");
   buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
   VBox layout2= new VBox(20);
   
   layout2.getChildren().addAll(label2, balInquiryBtn,  buttonBack1, areaInfo );
   scene2= new Scene(layout2,500,500);
   primaryStage.setTitle("Withdraw From Account");
   //depBtn.setOnAction(e -> withdraw(depAmnt));
   //balInquiry.setOnAction(e -> primaryStage.setScene(scene1));//change to an anction so that it deposits money!
       balInquiryBtn.setOnAction(e -> {
//             double amount = Integer.parseInt(withdrawAmnt.getText());
//             account2.withdraw(amount);
//              
       areaInfo.setText("Your curent balance is $"+account2.balance);
        });
   primaryStage.setScene(scene2);
   primaryStage.show();
}

public void MiniStatement(Stage primaryStage){// to ballance inquiry money
   Button miniStatementBtn = null;
   Label accountNumLabel = null;
   TextArea areaInfo = new TextArea();
   miniStatementBtn = new Button("Get Mini Bank Statement");

   //int wAmnt =  (int) withdrawAmnt;// 
   accountNumLabel = new Label("Inquire Balance ");
   
   VBox vb = new VBox(accountNumLabel, miniStatementBtn);
   vb.setSpacing(10);
   vb.setPadding(new Insets(20));
   FlowPane root = new FlowPane();
   root.getChildren().add(vb);
   Label label2= new Label("Mini Bank Statement ");
   Button buttonBack1= new Button("Back To Bank Actions");
   buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
   VBox layout2= new VBox(20);
   
   layout2.getChildren().addAll(label2, miniStatementBtn,  buttonBack1, areaInfo );
   scene2= new Scene(layout2,500,500);
   primaryStage.setTitle(" Bank Statementt");
   //depBtn.setOnAction(e -> withdraw(depAmnt));
   //balInquiry.setOnAction(e -> primaryStage.setScene(scene1));//change to an anction so that it deposits money!
       miniStatementBtn.setOnAction(e -> {
//             double amount = Integer.parseInt(withdrawAmnt.getText());
//             account2.withdraw(amount);
//              
       areaInfo.setText(account2.toString());
        });
   primaryStage.setScene(scene2);
   primaryStage.show();
}


public static void main(String[] args) {
launch(args);
}
};