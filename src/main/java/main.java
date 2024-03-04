import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage window){
        ConverterView view = new ConverterView();
        ConverterController controller = new ConverterController(view);

        Scene scene = new Scene(view, 300, 250);
        window.setTitle("Currency Converter");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args); 
    }
}
