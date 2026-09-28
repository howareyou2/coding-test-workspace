import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int nowDays = 0, previousDays = 0;
        for(int m = 1; m < m2; m++){
            nowDays += days[m];
        }
        nowDays += d2;

        for(int m = 1; m < m1; m++){
            previousDays += days[m];
        }
        previousDays += d1;

        System.out.print(nowDays - previousDays + 1);
    }
}