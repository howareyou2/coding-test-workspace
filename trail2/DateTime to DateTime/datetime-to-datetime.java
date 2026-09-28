import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int start =
                11 * 24 * 60
              + 11 * 60
              + 11;

        int target =
                A * 24 * 60
              + B * 60
              + C;

        int elapsed = target - start;

        System.out.print(elapsed < 0 ? -1 : elapsed);
    }
}