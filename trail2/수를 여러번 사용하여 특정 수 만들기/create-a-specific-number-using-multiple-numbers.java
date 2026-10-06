import java.util.*;

public class Main {
    static int A;
    static int B;
    static int C;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        memo = new int[C + 1];
        Arrays.fill(memo, -1);

        System.out.print(findMax(0));
    }

    static int findMax(int current) {
        if (current > C) {
            return -1;
        }

        if (memo[current] != -1) {
            return memo[current];
        }

        int useA = findMax(current + A);
        int useB = findMax(current + B);

        return memo[current] = Math.max(
            current,
            Math.max(useA, useB)
        );
    }
}