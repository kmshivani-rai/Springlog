package Javaproject.example.Newjava.Birthday;

public class Compre {
        public static void main(String[] args) {
            String[] strings = {"flower", "flow", "flight", "flioonn", "flowret"}; // Example input
            //Scanner cs = new Scanner(System.in);
            // int  input = cs.nextInt();
//String [] strings = new String[input];
            System.out.println("Longest Common Prefix: " + longestCommonPrefix(strings));
        }

        public static String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return ""; // If the input array is empty, return an empty string

            String prefix = strs[0]; // Start with the whole of the first string as a prefix

            for (int i = 0; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) { // As long as the current prefix is not a prefix of strs[i]
                    prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix size by one character
                    if (prefix.isEmpty()) return ""; // If no common prefix, return an empty string
                }
            } System.out.println(" helllooo");

            return prefix; // Return the common prefix found
        }
    }


