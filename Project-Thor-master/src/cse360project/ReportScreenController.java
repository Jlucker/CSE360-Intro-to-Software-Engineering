
package cse360project;

import java.lang.*;
import java.net.URL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ReportScreenController implements Initializable, TransitionController 
{
    ScreensController myController;

    public static String stepsUserName      = LoginScreenController.userName;
    public static String password           = LoginScreenController.password;
    public static String url                = "jdbc:mysql://168.62.213.183:3306/";
    public static String dbName             = "mydb";
    public static String driver             = "com.mysql.jdbc.Driver";
    public static String databaseUserName   = "CSE360Team";
    public static String databasePassword   = "FitnessTeam#360";
    
    public String numberOfSteps;
    public String stepsDate;

    @FXML
    private Button ReportSaveButton;
    @FXML
    private Button ReportCancelButton;
    @FXML
    private Label UsernameDisplayLabel;
  
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        UsernameDisplayLabel.setText(LoginScreenController.userName);
    }  
    
    @Override
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        
    }
    
    private void goToMainScreen()
    {
        myController.setScreen(ScreensFramework.mainScreenID);
    }
    
    @FXML
    private void saveButtonPressed(ActionEvent event)
    {
        ExportPDF.create(); 
        goToMainScreen();
    }
    
    @FXML
    private void cancelButtonPressed(ActionEvent event)
    {
        goToMainScreen();
    }
}
