import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(numbers(n));
    }

    static int numbers(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return numbers(n/3) + numbers(n - 1);
    }
}