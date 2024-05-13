package Javaproject.example.Newjava.Birthday;

public class Stringclass {
     public static void main(String[] args) {
            String str = "shivanir";
            str = str.toLowerCase();
            int count=0;	 int cCount=0;
            for(int i=0; i<str.length();i++){
                if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                    count++;
                    System.out.println(str.charAt(i));
                }
                else {  if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                    cCount++;
                    System.out.println(" count Consonant "+str.charAt(i));
                }
                }
            }    System.out.println(" count Consonant "+"--"+ cCount);

            System.out.println("---- Vowel  "+ count);
        }
    }


 /*
string


import java.util.Scanner;

public class CustomInitialsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String input = scanner.nextLine().trim(); // Read the input from user and trim any leading/trailing whitespace

        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
        } else {
            String[] words = input.split("\\s+"); // Split the input into words based on one or more spaces
            StringBuilder initials = new StringBuilder(); // StringBuilder to store the initials

            // Loop through all but the last word for initials
            for (int i = 0; i < words.length - 1; i++) {
                String word = words[i];
                if (!word.isEmpty()) { // Check if the word is not empty
                    initials.append(word.charAt(0)).append("."); // Append the first character and a period
                }
            }

            // Append the last name in full
            if (words.length > 0) {
                initials.append(words[words.length - 1]); // Append the last word in full
            }

            System.out.println(initials.toString()); // Print the initials
        }

        scanner.close(); // Close the scanner
    }
}

*/
