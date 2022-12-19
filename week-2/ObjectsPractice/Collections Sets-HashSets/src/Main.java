import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Hash Sets are not ordered and does not allow duplicate values
        Set<String> names = new HashSet<>();
        names.add("Tim");
        names.add("Bob");
        names.add("Mike");

        System.out.println(names.contains("Mike"));

        System.out.println(names);

        // Convert set to Array
        String[] namesArr = names.toArray(names.toArray(new String[0]));

        // Tree Set does maintain natural ordering - it sorts in alphabetical order automatically
        // Not good on performance on huge sets
        Set<String> treeNames = new TreeSet<>();
        treeNames.add("Tim");
        treeNames.add("Bob");
        treeNames.add("Mike");

        System.out.println(treeNames.contains("Mike"));

        System.out.println(treeNames);
    }
}