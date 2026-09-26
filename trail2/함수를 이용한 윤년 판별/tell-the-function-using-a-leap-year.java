import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.print(check(y));
    }

    static boolean check(int year){
        if(year % 4 == 0) {
            if(year % 100 == 0 && year % 400 != 0) return false;
            return true;
        }
        return false;
    }
}