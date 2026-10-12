import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();

        board = new int[2001][2001];
        
        markBoard(new Point(ax1, ay1), new Point(ax2, ay2), 1);
        markBoard(new Point(bx1, by1), new Point(bx2, by2), 1);
        markBoard(new Point(mx1, my1), new Point(mx2, my2), 0);

        int result = 0;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == 1) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }

    static void markBoard(Point p1, Point p2, int mark) {
        for (int x = p1.x; x < p2.x; x++) {
            for (int y = p1.y; y < p2.y; y++) {
                board[x + OFFSET][y + OFFSET] = mark;
            }
        }
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}