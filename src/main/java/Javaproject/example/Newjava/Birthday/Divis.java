package Javaproject.example.Newjava.Birthday;
import java.util.Scanner;

public class Divis {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter a number
            System.out.println("Enter a number to check if it is divisible by 7:");
            int number = scanner.nextInt();
            // Check if the number is divisible by 7 without using the modulo operator
            if (isDivisibleBy7(number)) {
                System.out.println("The number " + number + " is divisible by 7.");
            } else {
                System.out.println("The number " + number + " is not divisible by 7.");
            }
            scanner.close();
        }

        // Method to check divisibility by 7 without using the modulo operator
        public static boolean isDivisibleBy7(int number) {
            if (number < 0) {
                number = -number; // Make the number positive if it is negative
            }

            while (number >= 7) {
                number -= 7;
            }
            return number == 0;
        }
    }






