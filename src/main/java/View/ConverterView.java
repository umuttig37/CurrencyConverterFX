package View;

import Controller.ConverterController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import Dao.CurrencyDao;
import javafx.collections.*;

public class ConverterView extends Application {
    private TextField amountfield;
    private ChoiceBox<String> sourceCurrencyBox;
    private ChoiceBox<String> targetCurrencyBox;
    private Label resultLabel;
    private Button convertButton;
    private VBox vBox = new VBox();
    CurrencyDao dao = new CurrencyDao();


    public ConverterView(){
        Label amountLabel = new Label("Amount:");
        amountfield = new TextField();

        Label sourceLabel = new Label("Source");
        sourceCurrencyBox = new ChoiceBox<>(FXCollections.observableArrayList(dao.getTargets()));

        Label targetLabel = new Label("Target");
        targetCurrencyBox = new ChoiceBox<>(FXCollections.observableArrayList(dao.getTargets()));

        resultLabel = new Label();

        convertButton = new Button("Convert");

        vBox.getChildren().addAll( amountLabel, amountfield, sourceLabel,
                sourceCurrencyBox, targetLabel, targetCurrencyBox,
                resultLabel, convertButton);
    }

    public TextField getAmountfield(){
        return amountfield;
    }
    public ChoiceBox<String> getSourceCurrencyBox(){
        return targetCurrencyBox;
    }
    public ChoiceBox<String> getTargetCurrencyBox(){
        return targetCurrencyBox;
    }
    public Label getResultLabel(){
        return resultLabel;
    }
    public Button getConvertButton(){
        return convertButton;
    }
    @Override
    public void start(Stage window){
        Scene scene = new Scene(vBox, 300, 250);
        window.setTitle("Currency Converter");
        window.setScene(scene);
        window.show();
    }
}
