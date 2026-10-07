import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        long n = toNumber(binary.toCharArray(), binary.length() - 1);

        System.out.print(makeBinary(n * 17));
    }

    static long toNumber(char[] arr, int index) {
        if (index < 0) {
            return 0;
        }

        long previous = toNumber(arr, index - 1);
        int current = arr[index] - '0';

        return previous * 2 + current;
    }

    static String makeBinary(long n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.append(n % 2);
            n /= 2;
        }

        return result.reverse().toString();
    }
}