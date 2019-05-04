package lviv.com;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Operations {
    int num1=-1;
    int num2=-1;
    String operation;
    int rez;

    // determination of action
    String operator(String text) {
        if (text.indexOf("+") != -1) {
            return "+";
        } else {
            if (text.indexOf("-") != -1) {
                return "-";
            } else {
                if (text.indexOf("*") != -1) {
                    return "*";
                } else {
                    return "/";
                }
            }
        }
    }

    // Determining the operator statement for dividing the line by two numbers
    int operationIndex(String text) {
        if (text.indexOf("+") != -1) {
            return text.indexOf("+");
        } else {
            if (text.indexOf("-") != -1) {
                return text.indexOf("-");
            } else {
                if (text.indexOf("*") != -1) {
                    return text.indexOf("*");
                } else {
                    return text.indexOf("/");
                }
            }
        }
    }


    public String TextInput(){
        System.out.println("Enter an expression in the form a+b: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public Operations() {
        try {
            String input = TextInput();
            // defining the  numbers
            try {
                num1 = Integer.parseInt(input.substring(0, operationIndex(input)).trim());
                num2 = Integer.parseInt(input.substring(operationIndex(input) + 1, input.length()).trim());
                rez = 1;
                System.out.print(input + "=");

            } catch (NumberFormatException e) {
                num1 = new stringToIntegerRom(input.substring(0, operationIndex(input))).num;
                num2 = new stringToIntegerRom(input.substring(operationIndex(input) + 1, input.length())).num;
                rez = 2;
                System.out.print(input.toUpperCase() + "=");
            }
            operation = operator(input);

        } catch (StringIndexOutOfBoundsException e){
            num2 = num1 = -1;
        }
    }


}
