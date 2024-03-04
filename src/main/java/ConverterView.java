import javafx.scene.control.*;
import javafx.scene.layout.*;
public class ConverterView extends VBox{
    private TextField amountfield;
    private ChoiceBox<String> sourceCurrencyBox;
    private ChoiceBox<String> targetCurrencyBox;
    private Label resultLabel;
    private Button convertButton;

    public ConverterView(){
        Label amountLabel = new Label("Amount:");
        amountfield = new TextField();

        Label sourceLabel = new Label("Source Currency:");
        sourceCurrencyBox = new ChoiceBox<>();

        Label targetLabel = new Label("Target Currency:");
        targetCurrencyBox = new ChoiceBox<>();

        resultLabel = new Label();

        convertButton = new Button("Convert");

        this.getChildren().addAll( amountLabel, amountfield, sourceLabel,
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
}
