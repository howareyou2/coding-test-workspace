import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(calculate(n));
    }

    static int calculate(int n){
        if(n < 10) return n * n;
        int number = n % 10;
        return calculate(n / 10) + number * number;
    }
}