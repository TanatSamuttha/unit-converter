package gui;

import java.util.ArrayList;

import javafx.scene.layout.HBox;

public class FormPane extends HBox {
    public static Form leftForm = new Form();
    public static Form rightForm = new Form();

    public FormPane(){
        getChildren().addAll(leftForm, rightForm);
    }

    public void update(ArrayList<String> unit){
        leftForm.update(unit);
        rightForm.update(unit);
    }
}
