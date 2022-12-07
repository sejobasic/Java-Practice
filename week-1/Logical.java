public class Logical {
  public static void main(String[] args) {
    int chemGrade = 70;
    int englishGrade = 65;
    String lang = "Java";

    if (chemGrade > 75 || englishGrade > 75 || lang.equals("Java")) {
      System.out.println("Congrats");
    } else {
      System.out.println("Next time");
    }
  }
}
