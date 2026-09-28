import java.util.*;

public class Main {
    static class Point{
        int x;
        int y;
        int number;

        Point(int x, int y, int number){
            this.x = x;
            this.y = y;
            this.number = number;
        }

        int distance(){
            return Math.abs(this.x) + Math.abs(this.y);
        }

        @Override
        public String toString(){
            return number + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] place = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            place[i] = new Point(points[i][0], points[i][1], i + 1);
        }
        // Please write your code here.
        Arrays.sort(place, (a, b) -> {
                if(a.distance() == b.distance()) return a.number - b.number;
                return a.distance() - b.distance();
            });

        for(Point p : place){
            System.out.print(p);
        }

    }
}