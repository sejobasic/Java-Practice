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
      int count = checkWin(board);

      if (count == 3) {
        System.out.println("X wins!!");
        break;
      } else if (count == -3) {
        System.out.println("O wins!!");
        break;
      } else if ( count == 8) {
        System.out.println("Its a tie!");
      }
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

    while(board[row][element] != '_') {
      System.out.print("Spot taken, try again: ");
      row = scan.nextInt();
      element = scan.nextInt();
    }
    return new int[] {row, element};
  }

  public static int checkWin(char[][] board) {
    int count = 0;

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X') {
          count++;
        } else if (board[i][j] == 'O') {
          count--;
        }
      }
      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X') {
          count++;
        } else if (board[j][i] == 'O') {
          count--;
        }
      }
      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    for (int i = 0; i < 3; i++) {
      if (board[i][i] == 'X') {
        count++;
      } else if (board[i][i] == 'O') {
        count--;
      }
      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

      for (int i = 0; i < 3; i++) {
      if (board[2 - i][i] == 'X') {
        count++;
      } else if (board[2 - i][i] == 'O') {
        count--;
      }
      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }
    return count;
  }
}
