import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }

        int[][] board = new int[201][201];

        // 모든 직사각형 칠하기
        for (int index = 0; index < n; index++) {
            for (int x = x1[index]; x < x2[index]; x++) {
                for (int y = y1[index]; y < y2[index]; y++) {
                    board[x + 100][y + 100] = 1;
                }
            }
        }

        int space = 0;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == 1) {
                    space++;
                }
            }
        }

        System.out.print(space);
    }
}