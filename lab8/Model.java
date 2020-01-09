package OOP.lab8;

import javafx.scene.control.Label;

public class Model {
    public void calculate(String firstInput, String secondInput,
                          Label output, Label firstException, Label secondException) {
        String errorMessage = "";
        float firstNumber = 0;
        float secondNumber = 0;

        try {
            firstNumber = Float.valueOf(firstInput);
        } catch (Exception e) {
            errorMessage = "Wrong value for first input";
            firstException.setText(errorMessage);
        }

        try {
            secondNumber = Float.valueOf(secondInput);
        } catch (Exception e) {
            errorMessage = "Wrong value for second input";
            secondException.setText(errorMessage);
        }
        try{
            if (errorMessage.equals("")) {
                float result = firstNumber / secondNumber;
                output.setText(String.valueOf(result));}
        }catch(Exception e)
        {
        }


    }
}
