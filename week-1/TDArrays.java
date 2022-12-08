import java.util.Arrays;

    // 2 Dimensional Arrays
    // 3 Rows 4 Elements
    // Each row is an array of 4 elements
    // [0, 0, 0, 0]
    // [0, 0, 0, 0]
    // [0, 0, 0, 0]

public class TDArrays {
  public static void main(String[] args) {
    int[][] grades = new int[3][4];

    // Harry's grades
    grades[0][0] = 72;
    grades[0][1] = 74;
    grades[0][2] = 78;
    grades[0][3] = 76;

    // Ron's grades
    grades[1][0] = 65;
    grades[1][1] = 64;
    grades[1][2] = 61;
    grades[1][3] = 67;

    // Hermiones grades
    grades[2][0] = 95;
    grades[2][1] = 98;
    grades[2][2] = 99;
    grades[2][3] = 100;

    System.out.println("\tHarry: " + Arrays.toString(grades[0]));
    System.out.println("\tRon: " + Arrays.toString(grades[1]));
    System.out.println("\tHermione: " + Arrays.toString(grades[2]));

    // Output
    // Harry: [72, 74, 78, 76]
    // Ron: [65, 64, 61, 67]
    // Hermione: [95, 98, 99, 100]


    // Shorter solution same outcome
    int[][] shorterGrades = {
      {72, 74, 78, 76},
      {65, 64, 61, 67},
      {95, 98, 99, 100}
    };

    // Looping 2D Arrays
    for (int i = 0; i < shorterGrades[0].length; i++) {
      System.out.println(shorterGrades[0][i]); // [0][0] [0][1] [0][2]
    }

    // Nested Loop
    for (int i = 0; i < shorterGrades.length; i++) {
      switch (i) {
        case 0: System.out.print("\tHarry: ");
        break;
        case 1: System.out.print("\tRon: ");
        break;
        case 2: System.out.print("\tHermione: ");
        break;
      }

      for (int j = 0; j < shorterGrades[i].length; j++) {
        System.out.print(shorterGrades[i][j] + " ");
      }
    }
    System.out.println("\n");
  }
}
