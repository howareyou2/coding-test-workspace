import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int num = a; num <= b; num++){
            if(!isDividedTwo(num) && !isFive(num) && !isTreeNotNine(num)) count++;
        }
        System.out.print(count);
    }
    static boolean isDividedTwo(int num){
        if(num % 2 == 0) return true;
        return false;
    }
    
    static boolean isFive(int num){
        if((num % 10) == 5) return true;
        return false;
    }
    
    static boolean isTreeNotNine(int num){
        if((num % 3 == 0) && (num % 9) != 0) return true;
        return false;
    }
}