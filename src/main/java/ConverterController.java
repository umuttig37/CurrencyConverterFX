import java.util.HashMap;
import javafx.scene.control.Alert;

public class ConverterController {
    private ConverterView view;
    private HashMap<String, Currency> currencies = new HashMap<>();

    public ConverterController(ConverterView view){
        this.view = view;
        currencies.put("USD", new Currency("USD", "United States Dollar", 1.0));
        currencies.put("EUR", new Currency("EUR", "Euro", 0.85));
        currencies.put("GBP", new Currency("GBP", "British Pound", 0.73));
        view.getConvertButton().setOnAction(e -> Convert());
    }

    private void Convert(){
        try{
            double amount = Double.parseDouble(view.getAmountfield().getText());
            String sourceCurrencyAbbreviation = view.getSourceCurrencyBox().getValue();
            String targetCurrencyAbbreviation = view.getTargetCurrencyBox().getValue();

            if(sourceCurrencyAbbreviation == null || targetCurrencyAbbreviation == null){
                ShowError("Please select amount and currencies.");
                return;
            }

            Currency sourceCurrency = currencies.get(sourceCurrencyAbbreviation);
            Currency targetCurrency = currencies.get(targetCurrencyAbbreviation);
            if (sourceCurrency == null || targetCurrency == null) {
                ShowError("Invalid currency selection.");
                return;
            }

            double sourceToUSD = sourceCurrency.getConversionRateToUSD();
            double targetToUSD = targetCurrency.getConversionRateToUSD();

            double convertedAmount = (amount / sourceToUSD) * targetToUSD;

            view.getResultLabel().setText(String.format("%.2f %s", convertedAmount, targetCurrency.getAbbreviation()));
        } catch (NumberFormatException ex) {
            ShowError("Please enter a valid amount.");
        }
    }

    private void ShowError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}





