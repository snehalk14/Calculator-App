package com.example.calculatorlogic;

public class Calculator {

    public static Double add(Double num1,Double num2)
    {
        Double result = num1+num2;
        return  result;
    }

    public static Double subtract(Double num1,Double num2)
    {
        Double result = num1-num2;
        return  result;
    }

    public static Double multiply(Double num1,Double num2)
    {
        Double result = num1*num2;
        return  result;
    }

    public static Double divide(Double num1,Double num2)
    {
        Double result = num1/num2;
        return  result;
    }

    public static Double log(Double num1)
    {
        Double result = Math.log10(num1);
        return  result;
    }

     public static Double ln(Double num1)
    {
        Double result = Math.log(num1);
        return  result;
    }

    public static Double power(Double num1,Double num2)
    {
        Double result = Math.pow(num1,num2);
        return  result;
    }

    public static Double root(Double num1)
    {
        Double result = Math.sqrt(num1);
        return  result;
    }

    public static Double factorial(int i,Double num1)
    {
        while (i>0)
        {
            num1=num1*i;
            i--;
        }

        return  num1;
    }

    public static Double sin(Double num1)
    {
        Double result = Math.sin(num1);
        return  result;
    }

    public static Double cos(Double num1)
    {
        Double result = Math.cos(num1);
        return  result;
    }

    public static Double tan(Double num1)
    {
        Double result = Math.tan(num1);
        return  result;
    }


}
