import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        long n = calculate(N.toCharArray(), N.length() - 1, A);

        System.out.print(makeMinary(n, B));
        
        
    }

    static long calculate(char[] arr, int index, int minary) {
        if (index < 0) {
            return 0;
        }

        long previous = calculate(arr, index - 1, minary);
        int current = arr[index] - '0';

        return previous * minary + current ;
    }

    static String makeMinary(long n, int minary) {
        if (n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.append(n % minary);
            n /= minary;
        }

        return result.reverse().toString();
    }
}