import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int num = A; num <= B; num++){
            count += check(num);
        }
        System.out.print(count);
    }

    static int check(int num){
        if(num % 3 == 0) return 1;
        
        int nowPosition = 6;
        while(num > 0){
            int value = num / (int) Math.pow(10, nowPosition);
            if (value != 0 && value % 3 == 0) return 1;
            num = num % (int) Math.pow(10, nowPosition--);
        }
        return 0;
    }
}