import java.util.Arrays;
import java.util.Scanner;

// Hangman is a word-guessing game. It keeps asking the user to guess characters until:

// guess every character correctly (win).
// miss 6 guesses (loss).

// chose a random word from array of words
// Store word characters in array
// Take users character input and compare input to each index in the array
// If input exists replace placeholder '_' to the found character
// Once word is completed print winner message

// If user input character is not present print guess again

public class Hangman {

    static Scanner scan = new Scanner(System.in);

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {

        String randomWord = randomWord();

        char[] wordChar = new char[randomWord.length()];
        char[] placeholderArr = new char[randomWord.length()];

        // Copying char by char into array
        for (int i = 0; i < wordChar.length; i++) {
            wordChar[i] = randomWord.charAt(i);
            placeholderArr[i] = '_';
        }

        char[] missArray = new char[5];
        boolean missCheck = false; 

        while (true) {
            System.out.print("Word: ");
            printArray(placeholderArr);

            if (Arrays.equals(placeholderArr, wordChar)) {
                System.out.println("GOOD WORK! YOU WON!");
                break; 
            }

            System.out.print("Misses: ");
            printArray(missArray);

            System.out.print("Guess: ");
            char userGuess = scan.next().charAt(0);

            placeholderArr = Arrays.copyOf(compare(placeholderArr, wordChar, userGuess), wordChar.length);

            missCheck = checkGuess(placeholderArr, userGuess);

            if (missCheck == false){                            // if missCheck = false add userGuess to missArray + phase++ for change phasesOfGallow
                for(int i = 0; i < missArray.length; i++){      // Adding an element to the first empty missArray's index
                    if(missArray[i] == 0) {
                        missArray[i] = userGuess;
                        break;
                    }
                }
            }
        }

    }

    public static String randomWord() {
        String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };
        
        double random = Math.random() * words.length;
        String randomWord = words[(int)random];
        return randomWord;
    }

    public static boolean checkGuess(char[] charArray, char userGuess) {
        boolean charMiss = true;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == userGuess) {
                charMiss = true;
                break;
            } else {
                charMiss = false;
            }
        }
        return charMiss;
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static char[] compare(char[] placeholderArr, char[] wordChar, char userGuess) {

        char[] compareArr = new char[wordChar.length];

        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] == userGuess) {
                compareArr[i] = userGuess;
            } else {
                compareArr[i] = '_';
            }
        }

        char[] returnArray = new char[wordChar.length];

        for(int i = 0; i < wordChar.length; i++){
            if(placeholderArr[i] != '_'){
                returnArray[i] = placeholderArr[i];
            } else if (placeholderArr[i] == '_' && compareArr[i] != '_'){
                returnArray[i] = compareArr[i];
            } else if (placeholderArr[i] == '_' && compareArr[i] == '_'){
                returnArray[i] = '_';
            }
        }

        return returnArray;
    }

}
