import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(checkValue(n));
    }

    static String checkValue(int num){
        if(num % 2 == 0){
            int temp = num / 10;
            temp += num % 10;
            if(temp % 5 == 0) return "Yes";
        }
        return "No";
    }
}