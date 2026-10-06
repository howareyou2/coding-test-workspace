import java.util.*;

public class Main {
    static class Line {
        char axis;
        int value;

        Line(char axis, int value) {
            this.axis = axis;
            this.value = value;
        }

        boolean contains(int px, int py) {
            if (axis == 'X') {
                return px == value;
            }

            return py == value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        List<Line> lines = new ArrayList<>();

        for (int coordinate = 0; coordinate <= 10; coordinate++) {
            lines.add(new Line('X', coordinate));
            lines.add(new Line('Y', coordinate));
        }

        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                for (int k = j + 1; k < lines.size(); k++) {
                    Line line1 = lines.get(i);
                    Line line2 = lines.get(j);
                    Line line3 = lines.get(k);

                    boolean allCovered = true;

                    for (int point = 0; point < n; point++) {
                        boolean covered =
                                line1.contains(x[point], y[point])
                             || line2.contains(x[point], y[point])
                             || line3.contains(x[point], y[point]);

                        if (!covered) {
                            allCovered = false;
                            break;
                        }
                    }

                    if (allCovered) {
                        System.out.print(1);
                        return;
                    }
                }
            }
        }

        System.out.print(0);
    }
}