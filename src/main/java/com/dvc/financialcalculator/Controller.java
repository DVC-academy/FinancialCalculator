package com.dvc.financialcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text showResult;
    @FXML
    private TextField groupNumberField;
    @FXML
    private TextField schoolNumberField;
    @FXML
    private TextField numberOfStudentsInAGroupField;
    @FXML
    private TextField numberOfSessionsAWeekField;
    @FXML
    private TextField creditPerStudentField;


    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        Calculator calculator = new Calculator(Integer.parseInt(schoolNumberField.getText()), Integer.parseInt(groupNumberField.getText()), Integer.parseInt(numberOfStudentsInAGroupField.getText()), Integer.parseInt(numberOfSessionsAWeekField.getText()), Integer.parseInt(creditPerStudentField.getText()));
        int monthlyRevenue = calculator.calculateMonthlyRevenue();
        showResult.setText("Bevétel egy hónapban: " + monthlyRevenue + " Ft, Bevétel egy évben: " + monthlyRevenue * 6);
    }
}
