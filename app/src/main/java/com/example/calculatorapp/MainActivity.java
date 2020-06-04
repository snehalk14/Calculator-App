package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calculatorlogic.Calculator;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;
    String sign, value1, value2, specialFunction;
    Double num1, num2, result;
    boolean hasDot, isSpecialFunctionOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);

        hasDot=false;
        isSpecialFunctionOn=false;
    }

    public void btnClick_0(View view)
    {
        input.setText(input.getText() + "0");
    }

    public void btnClick_1(View view)
    {
        input.setText(input.getText() + "1");
    }

    public void btnClick_2(View view)
    {
        input.setText(input.getText() + "2");
    }

    public void btnClick_3(View view)
    {
        input.setText(input.getText() + "3");
    }

    public void btnClick_4(View view)
    {
        input.setText(input.getText() + "4");
    }

    public void btnClick_5(View view)
    {
        input.setText(input.getText() + "5");
    }

    public void btnClick_6(View view)
    {
        input.setText(input.getText() + "6");
    }

    public void btnClick_7(View view)
    {
        input.setText(input.getText() + "7");
    }

    public void btnClick_8(View view)
    {
        input.setText(input.getText() + "8");
    }

    public void btnClick_9(View view)
    {
        input.setText(input.getText() + "9");
    }

    public void btnClick_dot(View view)
    {
        if(!hasDot)
        {
            if(input.getText().equals(""))
            {
                hasDot=true;
                input.setText("0.");
            }
            else {
                input.setText(input.getText() + ".");
            }

            hasDot=true;
        }
    }

    public void btnClick_add(View view)
    {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        hasDot=false;
    }

    public void btnClick_subtract(View view)
    {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        hasDot=false;
    }

    public void btnClick_multiply(View view)
    {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("*");
        hasDot=false;
    }

    public void btnClick_divide(View view)
    {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("/");
        hasDot=false;
    }

    public void btnClick_log(View view)
    {
        specialFunction = "log";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("log");
        hasDot=false;
    }

    public void btnClick_ln(View view)
    {
        specialFunction = "ln";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("ln");
        hasDot=false;
    }

    public void btnClick_power(View view)
    {
        specialFunction = "power";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("x^n");
        hasDot=false;
    }

    public void btnClick_root(View view)
    {
        specialFunction = "root";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("√");
        hasDot=false;
    }

    public void btnClick_sin(View view)
    {
        specialFunction = "sin";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("sin");
        hasDot=false;
    }

    public void btnClick_cos(View view)
    {
        specialFunction = "cos";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("cos");
        hasDot=false;
    }

    public void btnClick_tan(View view)
    {
        specialFunction = "tan";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("tan");
        hasDot=false;
    }


    public void btnClick_factorial(View view)
    {
        specialFunction = "factorial";
        value1 = input.getText().toString();
        input.setText(null);
        isSpecialFunctionOn=true;
        signBox.setText("!");
        hasDot=false;
    }
    public void btnClick_equal(View view)
    {
        if((specialFunction == null && sign == null)||input.getText().equals(""))
        {
            signBox.setText("Error!!");
        }
        else if(specialFunction != null)
        {
            switch (specialFunction){
                default:
                    break;
                case "log":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Calculator.log(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                     break;
                case "ln":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText( Calculator.ln(num1)+ "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "power":
                    num1=Double.parseDouble(value1);
                    value2=input.getText().toString();
                    num2=Double.parseDouble(value2);
                    input.setText(Calculator.power(num1,num2) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "root":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Calculator.root(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);

                    int i = Integer.parseInt(value1)-1;

                    input.setText(Calculator.factorial(i,num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "sin":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Calculator.sin(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Calculator.cos(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Calculator.tan(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
            }
        }
        else if(sign != null)
        {
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign)
            {
                default:
                    break;
                case "+":
                    result=Calculator.add(num1,num2);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "-":
                    result=Calculator.subtract(num1,num2);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "*":
                    result=Calculator.multiply(num1,num2);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "/":
                    result=Calculator.divide(num1,num2);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;

            }
        }
        else
        {
            input.setText("Error!!");
        }
    }

    public void btnClick_delete(View view)
    {
        if(input.getText().equals(""))
        {
            input.setText(null);
        }else {
            int len =  input.getText().length();
            String s = input.getText().toString();
            if(s.charAt(len - 1) == '.')
            {
                hasDot=false;
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
            }
            else {
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
            }
        }
    }

    public void btnClick_clear(View view)
    {
        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


}
