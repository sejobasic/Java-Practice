import java.util.Arrays;

public class StringArg {

    public static void main(String... args) {
        String[] splitStrings = "Hello World Again".split(" ");

        System.out.println(Arrays.toString(splitStrings));
    }
}
