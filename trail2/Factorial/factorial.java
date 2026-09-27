import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(factory(n));
    }

    static int factory(int n){
        if(n == 1) return 1;
        return factory(n - 1) * n;
    }
}