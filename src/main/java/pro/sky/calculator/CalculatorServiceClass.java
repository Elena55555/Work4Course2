package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceClass implements CalculatorService {

    public String hello() {
        return "<b> Welcome  " + "    to   " + " this   " + "   calculator </b> ";
    }

    public String  plus(Integer num1, Integer num2) {
        if ( (num1==null) || (num2==null)) {
            return "Mistake! А parameter or two parameters, or the parameter value is not given.";
        } else return num1 + " + " + num2 + " = " + (num1 + num2);
    }


    public String minus(Integer num1, Integer num2) {
        if ( (num1==null) || (num2==null)) {
            return "Mistake!   А parameter or two parameters, or the parameter value is not given.";
        } else return num1 + " - " + num2 + " = " + (num1 - num2);
    }


    public String multiply (Integer num1, Integer num2) {
        if ( (num1==null) || (num2==null)) {
            return "Mistake!  А parameter or two parameters, or the parameter value is not given.";
        } else  return num1 + " * " + num2 + " = " + (num1 * num2);
    }


    public String divide (Integer num1, Integer num2) {
        if ( (num1==null) || (num2==null)) {
            return "Mistake!  А parameter or two parameters, or the parameter value is not given.";}
        if (num2==0){
            return "Mistake! You can't divide by zero.";}
        else  return num1 + " : " + num2 + " = " + (num1 / num2);
        }
    }




