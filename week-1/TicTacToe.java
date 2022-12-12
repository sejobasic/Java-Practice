import java.util.Scanner;

public class TicTacToe {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    char[][] board = {
      {'_', '_', '_',},
      {'_', '_', '_',},
      {'_', '_', '_',}
    };
    System.out.println("\nLets play tic-tac-toe");
    printBoard(board);

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println("Turn: X");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
      } else {
        System.out.println("Turn: O");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
      }
      printBoard(board);
    }
  }

  public static void printBoard(char[][] array) {
    System.out.println('\n');
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "  ");
      }
      System.out.println("\n");
    }
  }

  public static int[] askUser(char[][] board) {
    System.out.print("Pick the row and column: ");
    int row = scan.nextInt();
    int element = scan.nextInt();

    return new int[] {row, element};
  }
}
