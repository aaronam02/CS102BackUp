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
//  
//************************************************************************

public class BankAccountApp extends Application{
    
    private Checking account1 = new Checking("Thomas", "504020", 5000, 2.5);
    private Checking account2 = new Checking("Jane", "86443620845",10000, 0.15);//creates accounts
    
public Scene scene1, scene2, scene3, scene4, scene5;
// Scene scene1, scene2;
@Override
public void start(Stage primaryStage) {
   primaryStage.setTitle("Bank Account GUI");
   
   //Scene 1
   //buttons on first page.
   Label label1= new Label("Bank Actions");
   Button button1= new Button("Deposit");
   button1.setOnAction(e -> Deposit(primaryStage)); 
   Button button2= new Button("Withdraw");
   button2.setOnAction(e -> Withdraw(primaryStage)); 
   Button button5= new Button("Transfer");
   button5.setOnAction(e -> Transfer(primaryStage));
   Button button3= new Button("Balance Inquiry");
   button3.setOnAction(e -> BalanceInquiry(primaryStage)); 
   Button button4= new Button("Mini Statement");
   button4.setOnAction(e -> MiniStatement(primaryStage)); 
    
   VBox layout1 = new VBox(20);     
   layout1.getChildren().addAll(label1, button1, button2,button5, button3, button4);
   scene1= new Scene(layout1, 500, 500);     
   primaryStage.setScene(scene1);
   primaryStage.show();
}

public void Deposit(Stage primaryStage){// to deposit money
   Button depBtn = null;
   Label accountNumLabel = null;
   depBtn = new Button("Deposit In Account");
   TextArea areaInfo = new TextArea();//to enter amounts to be tranfered
   TextField depAmnt = new TextField();//for printing data/actions

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
      depBtn.setOnAction(e -> {
         double amount = Integer.parseInt(depAmnt.getText());
         account2.deposit(amount);
         areaInfo.setText("Your new balance is: $" + account2.balance);

        });
        
   primaryStage.setScene(scene2);
   primaryStage.show();
}

public void Withdraw(Stage primaryStage){// to withdraw money
   Button withdrawBtn = null;
   TextArea areaInfo = new TextArea();
   Label accountNumLabel = null;
   withdrawBtn = new Button("Withdraw From Account");
   TextField withdrawAmnt = new TextField();
   
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
   withdrawBtn.setOnAction(e -> {
      double amount = Integer.parseInt(withdrawAmnt.getText());
         account2.withdraw(amount); 
         areaInfo.setText("Your new balance is: $" + account2.balance);
        });
   
   primaryStage.setScene(scene2);
   primaryStage.show();
}

public void Transfer(Stage primaryStage){// to deposit money
   Button transBtn = null;
   Label accountNumLabel = null;
   transBtn = new Button("Tranfer to Account");
   TextArea areaInfo = new TextArea();
   TextField transferAmt = new TextField();
   accountNumLabel = new Label("Enter Transfer Amount");
   VBox vb = new VBox(accountNumLabel, transferAmt, transBtn);
   vb.setSpacing(10);
   vb.setPadding(new Insets(20));
   
   FlowPane root = new FlowPane();
   root.getChildren().add(vb);

   Label label2= new Label("Tranfer Money");
   Button buttonBack1= new Button("Back To Bank Actions");
   buttonBack1.setOnAction(e -> primaryStage.setScene(scene1));
   VBox layout2= new VBox(20);
   
   layout2.getChildren().addAll(label2, transferAmt, transBtn, buttonBack1,areaInfo );
   scene2= new Scene(layout2,500,500);
   
   primaryStage.setTitle("Transfer");
     transBtn.setOnAction(e -> {
         double amount = Integer.parseInt(transferAmt.getText());
         String info = account2.transfer(account2, amount, account1);
         areaInfo.setText(info);
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
   balInquiryBtn.setOnAction(e -> {             
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
      miniStatementBtn.setOnAction(e -> {       
         areaInfo.setText(account2.toString());
       });
   primaryStage.setScene(scene2);
   primaryStage.show();
}


public static void main(String[] args) {
launch(args);
}
};