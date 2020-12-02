import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

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

public class MyFxApp extends Application {

   Button goBtn = null;
   TextField meanText = null;
   Label accountNumLabel = null;

   @Override
   public void start(Stage primaryStage) throws Exception {

       goBtn = new Button("Go");
       meanText = new TextField();
       accountNumLabel = new Label("Enter Account Number");

       primaryStage.setTitle("My Bank JavaFX App");

       VBox vb = new VBox(accountNumLabel, meanText/*
                                                   * , stddeviationLabel,
                                                   * stdDeviationText,
                                                   * noOfDatatobeRandomlyGenartedLabel
                                                   * ,
                                                   * noOfDatatobeRandomlyGenartedText
                                                   * ,
                                                   */, goBtn);
       vb.setSpacing(10);
       vb.setPadding(new Insets(20));

       FlowPane root = new FlowPane();
       root.getChildren().add(vb);

       // usual code at the end of start
       Scene scene = new Scene(root, 300, 250);

       primaryStage.setScene(scene);

       goBtn.setOnAction(e -> handleButtonAction(e));

       primaryStage.show();

   }

   public void handleButtonAction(ActionEvent event) {
       Button b = (Button) event.getSource();
       System.err.println("[ hello ]");
       csvReader();
   }

   public static void main(String[] args) {
       Application.launch(args);
   }

   public double differenceOfSquares(List<Double> list, double mean) {
       double sum = 0;
       // list.forEach( item -> sum += (item – mean)*(item – mean));
       return sum;
   }

   public Double getMaximum(List<Double> list) {
       return list.get(list.size() - 1);
   }

   public Double getMinium(List<Double> list) {
       return list.get(0);
   }

   public Double getMediean(List<Double> list) {
       return list.get(list.size() / 2);
   }

   private void csvReader() {
       String csvFile = "d://account.csv";
       BufferedReader br = null;
       String line = "";
       String cvsSplitBy = ",";

       try {

           br = new BufferedReader(new FileReader(csvFile));
           while ((line = br.readLine()) != null) {
               // use comma as separator
               String[] country = line.split(cvsSplitBy);
               System.out.println("Account [code= " + country[1] + " , name="
                       + country[2] + "]");
           }

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (br != null) {
               try {
                   br.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }

   }
}

