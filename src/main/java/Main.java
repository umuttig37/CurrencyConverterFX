import Controller.ConverterController;
import Dao.CurrencyDao;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import View.ConverterView;

import Datasource.DataConnection;
public class Main{



    public static void main(String[] args) {

        DataConnection.terminate();

        ConverterView.launch(ConverterView.class);
    }
}
