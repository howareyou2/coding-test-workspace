import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int sumValue = sum(n);
        System.out.print(sumValue/10);

    }

    static int sum(int lastNumber){
        int result = 0;
        for(int num = 1; num <= lastNumber; num++){
            result += num;
        }
        return result;
    }
}