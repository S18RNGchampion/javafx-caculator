package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;

public class Controller implements Initializable {
    @FXML
    private TextField field;
    private boolean test = true;
    private double firstNum = 0;
    private double secondNum = 0;
    private int method = 0;

    public void initialize(URL location, ResourceBundle resources) {

        // TODO (don't really need to do anything here).

    }

    public void setStart() {
        test = true;
        firstNum = 0;
        secondNum = 0;
        method = 0;
    }

    public void setNumber1(ActionEvent event) {
        if (test) {
            field.setText("1");
            test = false;
        } else {
            field.appendText("1");
        }
    }

    public void setNumber2(ActionEvent event) {
        if (test) {
            field.setText("2");
            test = false;
        } else {
            field.appendText("2");
        }
    }

    public void setNumber3(ActionEvent event) {
        if (test) {
            field.setText("3");
            test = false;
        } else {
            field.appendText("3");
        }
    }

    public void setNumber4(ActionEvent event) {
        if (test) {
            field.setText("4");
            test = false;
        } else {
            field.appendText("4");
        }
    }

    public void setNumber5(ActionEvent event) {
        if (test) {
            field.setText("5");
            test = false;
        } else {
            field.appendText("5");
        }
    }

    public void setNumber6(ActionEvent event) {
        if (test) {
            field.setText("6");
            test = false;
        } else {
            field.appendText("6");
        }
    }

    public void setNumber7(ActionEvent event) {
        if (test) {
            field.setText("7");
            test = false;
        } else {
            field.appendText("7");
        }
    }

    public void setNumber8(ActionEvent event) {
        if (test) {
            field.setText("8");
            test = false;
        } else {
            field.appendText("8");
        }
    }

    public void setNumber9(ActionEvent event) {
        if (test) {
            field.setText("9");
            test = false;
        } else {
            field.appendText("9");
        }
    }

    public void setNumber0(ActionEvent event) {
        String regex = "00";
        if(!(field.getText()+"0").equals(regex))
         {
            if (test) {
                field.setText("0");
                test = false;
            } else {
                field.appendText("0");
            }
        }else{
            test=false;
        }
    }

    public void setPoint(ActionEvent event) {
        String test = field.getText();
        String regex = "[\\d+]";
        if (test.matches(regex)) {
            field.appendText(".");
        }
    }

    public void setAdd(ActionEvent event) {
        firstNum = Double.parseDouble(field.getText());
        test = true;
        method = 1;
    }

    public void setReduce(ActionEvent event) {
        firstNum = Double.parseDouble(field.getText());
        test = true;
        method = 2;
    }

    public void setMultiply(ActionEvent event) {
        firstNum = Double.parseDouble(field.getText());
        test = true;
        method = 3;
    }

    public void setDivide(ActionEvent event) {
        firstNum = Double.parseDouble(field.getText());
        test = true;
        method = 4;
    }

    public void setClear(ActionEvent event) {
        setStart();
        field.setText("0");
    }

    public void setEqual(ActionEvent event) {
        secondNum = Double.parseDouble(field.getText());
        switch (method) {
            case 1:
                field.setText(String.valueOf(firstNum + secondNum));
                break;
            case 2:
                field.setText(String.valueOf(firstNum - secondNum));
                break;
            case 3:
                field.setText(String.valueOf(firstNum * secondNum));
                break;
            case 4:
                field.setText(String.valueOf(firstNum / secondNum));
                break;
        }
        setStart();


    }


}
