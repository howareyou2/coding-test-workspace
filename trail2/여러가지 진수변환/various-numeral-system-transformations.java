import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.append(n % b);
            n /= b;
        }

        System.out.print(result.reverse());
    }
}