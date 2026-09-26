import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int gcdValude = gcd(n, m);

        System.out.print(n / gcdValude * m);
    }

    static int gcd(int a, int b){
        while(b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }
}