import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int num = a; num <= b; num++){
            if(isPrime(num) && isEvenSum(num)) count++;
        }
        System.out.print(count);
    }

    static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }

    static boolean isEvenSum(int num){
        String number = Integer.toString(num);
        int sum = 0;
        for(int c = 0; c < number.length(); c++){
            sum += number.charAt(c) - '0';
        }
        if(sum % 2 == 0) return true;
        
        return false;
    }
}