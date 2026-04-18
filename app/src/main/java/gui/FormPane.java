package gui;

import java.util.ArrayList;

import javafx.scene.layout.HBox;

public class FormPane extends HBox {
    public static Form leftForm = new Form();
    public static Form rightForm = new Form();

    public FormPane(){
        getChildren().addAll(leftForm, rightForm);

        leftForm.field.textProperty().addListener(e -> {
            if(leftForm.field.isFocused()){
                updateValue(leftForm, rightForm);
            }
        });

        leftForm.unit.setOnAction(e -> {
            updateValue(rightForm, leftForm);
        });

        rightForm.field.textProperty().addListener(e -> {
            if(rightForm.field.isFocused()){
                updateValue(rightForm, leftForm);
            }
        });

        rightForm.unit.setOnAction(e -> {
            updateValue(leftForm, rightForm);
        });
    }

    public void update(ArrayList<String> unit){
        leftForm.update(unit);
        rightForm.update(unit);
    }

    public void updateValue(Form changeForm, Form resultForm){
        double value = Double.parseDouble(changeForm.field.getText());
        double changeFactor = QuantityDropdown.getFactor(changeForm.getCurrentUnit());
        double resultFactor = QuantityDropdown.getFactor(resultForm.getCurrentUnit());
        double middleValue = value / changeFactor;
        double result = middleValue * resultFactor;
        resultForm.field.setText(String.valueOf(result));
    }
}
