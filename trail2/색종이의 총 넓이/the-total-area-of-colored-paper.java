import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        int[][] board = new int[201][201];
        int OFFSET = 100;
        int SIZE = 8;
        int result = 0;

        for(int index = 0; index < n; index++){
            for(int r = x[index]; r < x[index] + SIZE; r++){
                for(int c = y[index]; c < y[index]+ SIZE; c++){
                    board[r + 100][c + 100] = 1;
                }
            }
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(board[r][c] == 1) result++;
            }
        }

        System.out.print(result);
    }
}