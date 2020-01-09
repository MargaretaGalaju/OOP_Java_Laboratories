package OOP.lab8;


import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {

    private Model model = new Model();

    @FXML
    private Label output;

    @FXML
    private Label firstException;

    @FXML
    private Label secondException;

    @FXML
    private TextArea firstNumber;

    @FXML
    private TextArea secondNumber;

    @FXML
    private void divide() {
        firstException.setText("");
        secondException.setText("");
        output.setText("");
        model.calculate(firstNumber.getText(), secondNumber.getText(), output, firstException, secondException);
    }

    @FXML
    private void clear() {
        firstException.setText("");
        secondException.setText("");
        output.setText("");
        firstNumber.clear();
        secondNumber.clear();
    }

    @FXML
    private void initialize(){
        secondNumber.setOnKeyReleased((event -> {
            try {
                secondException.setText("");
                if (secondNumber.getText().equals("13")) {
                    throw new UnluckyException("Sorry you are unlucky");
                }
                if (secondNumber.getText().equals("0")){
                    throw new ArithmeticException("Can't divide on 0");
                }

            } catch (Exception e) {
                secondException.setText(e.getMessage());
            }
        }));
    }
}
