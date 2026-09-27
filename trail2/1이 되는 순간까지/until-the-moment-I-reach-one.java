import java.util.Scanner;
public class Main {
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        calculate(n, 0);
        System.out.print(result);
    }

    static int calculate(int n, int count){
        if(n == 1) {
            result = count;
            return 0;
        }
        if(n % 2 == 0) return calculate(n / 2, count + 1);
        else return calculate(n / 3, count + 1);
    }
}