import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int[] numbers = {a, b, c};
        int result = 1;
        for(int num: numbers){
            result *= num;
        }
        System.out.print(sum(result));
    }

    static int sum(int num){
        if(num < 10) return num;
        return sum(num / 10) + (num % 10);
    }
}