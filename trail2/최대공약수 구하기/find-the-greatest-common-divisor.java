import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        while(n != 0){
            int reminder = m % n;
            m = n;
            n = reminder;
        }
        
        System.out.print(m);
    }
}