package com.codingwithnish;

import java.util.Scanner;

public class Main {
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            double firstNumber;
            double secondNumber;
            // using double because it's bigger than a float. So it makes more sense.
            Scanner calculator = new Scanner(System.in);
            System.out.println("Welcome to the Dream Corp Calculator!");
            System.out.println("Enter First Number");
            firstNumber = calculator.nextDouble();
            System.out.println("Enter Second Number");
            secondNumber = calculator.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            // Scanner - So the user has the ability to input numbers in the terminal "console"
            // Print Lines
            char operator = calculator.next().charAt(0);

            double output = 0;
            switch (operator) {
                case '+':
                    output = firstNumber + secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);
                    break;
                case '-':
                    output = firstNumber - secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);
                    break;
                case '*':
                    output = firstNumber * secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.err.println("Naw Player, cant divide by Zero");
                        break;
                    }
                    output = firstNumber / secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + output);
                    break;
                //statements that may cause an exception. In this case you cant divide by Zero ( 0 ).
                default:
                    System.out.println("You have entered wrong operator");
                    break;
            }
        }
    }

    /* If user enters any other operator or char apart from
     * +, -, * and /, then display an error message to user
     *
     */

// User: 5  3
// User: *
// Output:  5 * 3 = 15.


