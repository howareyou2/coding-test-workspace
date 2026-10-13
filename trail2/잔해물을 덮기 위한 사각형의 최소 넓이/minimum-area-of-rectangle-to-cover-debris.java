import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();

        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();

        int[][] board = new int[2001][2001];

        for (int x = rect1_x1; x < rect1_x2; x++) {
            for (int y = rect1_y1; y < rect1_y2; y++) {
                board[x + OFFSET][y + OFFSET] = 1;
            }
        }

        for (int x = rect2_x1; x < rect2_x2; x++) {
            for (int y = rect2_y1; y < rect2_y2; y++) {
                board[x + OFFSET][y + OFFSET] = 0;
            }
        }

        System.out.print(checkSize(board));
    }

    static int checkSize(int[][] board) {
        int minX = board.length;
        int minY = board[0].length;
        int maxX = -1;
        int maxY = -1;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == 1) {
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }
        if (maxX == -1) {
            return 0;
        }

        int width = maxX - minX + 1;
        int height = maxY - minY + 1;

        return width * height;
    }
}