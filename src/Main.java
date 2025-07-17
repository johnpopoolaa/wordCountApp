import java.util.Scanner; // import scanner class to use scanner

public class Main {
    public static void main(String[] args) {
        // Welcome user to the website
        System.out.println("==============================");
        System.out.printf("Welcome to the wordCounter!%n");
        System.out.println("==============================");
        System.out.println("Input a text and I will give you the string");

        // prompt user to press enter to continue
        System.out.print("Press ENTER to continue");
        Scanner sc = new Scanner(System.in); // create the scanner object
        sc.nextLine(); // wait for enter to be clicked

        // we use a do-while loop to handle errors like a user entering empty text or whitespaces only and run until an expected output is got.
        do {
            System.out.println("Enter your text:"); // ask user to input a text
            String str = sc.nextLine(); // store the input of the user in a string

            // check if the user inputs an empty string or whitespace only
            if (str == null || str.isBlank()) {
                System.out.println("No message or character detected. Please enter a valid input or use 'exit' or 'end' to close the program");
                continue; // continue is used so the do-while loop is not terminated if this runs
            }

            // check if the user enters "exit" or "end"
            if (str.equalsIgnoreCase("exit") || str.equalsIgnoreCase("end")) {
                System.out.println("Closed successfully"); // print "closed successfully" message
                break; // terminate the loop
            }

            // this would be run if the loop is not terminated only
            int strLength = str.length(); // find the length of the string

            String trimmedStr = str.trim(); // remove the trailing whitespaces

            String removeSpaces = str.replaceAll("\\s", ""); // remove the whitespaces to count the non-whitespaces characters
            int charCount = removeSpaces.length(); // get the length of the characters

            String letterOnly = trimmedStr.replaceAll("[^a-zA-Z]", ""); // remove all non-letter characters
            int letterCount = letterOnly.length(); // store the length of the letters in the string

            String[] words = trimmedStr.split("\\s+"); // store the words from the string in an array using whitespace as the delimiter

            // set the count of all the strings to zero
            int wordCount = 0;
            int numberCount = 0;
            int specialCount = 0;

            // logic to count the words, numbers and special characters
            for (String s : words) {
                String clean = s.replaceAll("(?<!^)\\p{Punct}+$|^(?=[A-za-z0-9@])", ""); // remove leading punctuation only if what's next is a letter, digit or @ *idg too
                if (clean.matches("[a-zA-Z]+.?")) { // check if the string contains letters only(they could with punctuations too)
                    wordCount++; // increase the word count
                } else if (s.matches("\\d+.?")) { // check if the string contains numbers only(cound end with punctuations too)
                    numberCount++; // increase number count
                } else if (clean.matches("@\\p{Alnum}+")) { // check if the string starts with an @
                    specialCount++; // increase the special string count
                } else { // if the string doesn't meet any of the above criteria
                    specialCount++; // increase the special string count
                }
            }

            System.out.println("The text you inputted has:\n"
                    + strLength + " characters with spaces.\n" // print the number of characters including spaces
                    + charCount + " characters without spaces.\nand " // print the number of characters excluding spaces
                    + letterCount + " letters."); // print the number of letters only
            System.out.println(); // print a new line to get a line break
            System.out.println("You entered:\n"
                    + "Words: " + wordCount // print the number of words
                    + "\nNumbers: " + numberCount // print the number of numbers
                    + "\nSpecial/Mixed Inputs: " + specialCount); // print the number of special inputs
            break; // terminate the loop
        } while(true);
        sc.close(); // close the scanner resource
        }
    }