public class Main {
    public static void main(String[] args) {
        // TEXT BLOCK FORMAT
        String textBlock = """
                Print a Bulleted List:
                    • First Bullet
                        • Second Bullet""";
        System.out.println(textBlock);

        // %d is used to inject our variable it is replaced by the value of age
        int age = 29;
        System.out.printf("Your age is %d\n", age);

        int birthYear = 2022 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, birthYear);


        // STRING METHODS
        String test = "Test String";

        // Returns the number of characters in string
        System.out.println(test.length());
        // Returns the character at the index that's passed in
        System.out.println(test.charAt(1));
        // Returns the character at the last index
        System.out.println(test.charAt(test.length() - 1));
        // Returns an integer, representing the index in teh sequence where the
        // string or character passed, can be located in the string
        System.out.println(test.indexOf("est"));
        // Returns true if the length is zero
        System.out.println(test.isEmpty());
        // Returns true if length is zero OR the string only contains whitespace characters
        System.out.println(test.isBlank());
        // Return a boolean if the string's value is equal to the value of the argument passed in
        System.out.println(test.equals("String"));
        // Return a boolean if the string contains the argument passed in
        System.out.println(test.contains("Test"));

        // STRING MANIPULATION METHODS

        // Concatenates text to the string and returns a new string as the result
        System.out.println(test.concat(" Concat"));
        // Allows multiple strings to be concatenated together in a single method
        System.out.println(test.join("/", "Test", "Test"));
        // Returns the string repeated by the number of times specified by argument
        System.out.println(test.repeat(10));
        // These methods replace characters or strings in the string
        // returning a new string with replacements made
        System.out.println(test.replace("T", "t"));
        System.out.println(test.replaceAll("/", "-"));
        System.out.println(test.replaceFirst("/", "---"));
    }
}