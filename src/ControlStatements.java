/*
David McClung
01/03/21
"A Year of lockdown already!"
In my house
 */

import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args) {

        //1. Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println("Please enter a number to determine if it is a negative or a positive");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println(number + " is a positive number :) ");

        } else if (number < 0) {
            System.out.println(number + " is a negative number :( ");
        }


        //2. Take three numbers from the user and print the greatest number.

        System.out.println("\nPlease enter three numbers to determine which is the greatest number\nFirst Number");

        int num1 = sc.nextInt();

        System.out.println("Second number");

        int num2 = sc.nextInt();

        System.out.println("Third number");

        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest: " + num1);
            }
        }

        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("The greatest: " + num2);
            }
        }

        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("The greatest: " + num3);
            }
        }

        //3. Write a Java program that accepts three numbers and prints
        // "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

        System.out.println("\nPlease enter three numbers to determine if they are equal or different\nFirst Number");

        int numb1 = sc.nextInt();

        System.out.println("Second number");

        int numb2 = sc.nextInt();

        System.out.println("Third number");

        int numb3 = sc.nextInt();

        //&& operator is used to determine if both statements are true and if so then the message will be printed to the system.
        //essentially this bit of code is asking if these numbers AND (&&) these numbers are equal then yes!
        if (numb1 == numb2 && numb1 == numb3) {
            System.out.println("All numbers are equal");

        // || operator is used to determine if all three are different if so then message will be printed. && means AND
            //same as above || is used to ask if its this number OR this number. || means OR
        } else if ((numb1 == numb2) || (numb1 == numb3) || (numb3 == numb2)) {
            System.out.println("Neither all are equal or different");
        //otherwise neither or!
        } else {
            System.out.println("All numbers are different");
        }

        //4. Write a program that accepts three numbers from the user and prints
        // "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

        System.out.println("\nPlease enter three numbers to determine if they are increasing or decreasing\nFirst Number");

        int number1 = sc.nextInt();

        System.out.println("Second number");

        int number2 = sc.nextInt();

        System.out.println("Third number");

        int number3 = sc.nextInt();


        if (number1 < number2 && number2 < number3) {
            System.out.println("Numbers increasing");


        } else if (number1 > number2 && number2 > number3){
            System.out.println("Numbers decreasing");
            //otherwise neither or!
        } else {
            System.out.println("Neither increasing or decreasing!");
        }

    } //main
} //class
