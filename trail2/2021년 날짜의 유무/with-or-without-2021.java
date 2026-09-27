import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int[] month = {
            0,
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };
       
        System.out.print(isDate(m, d, month)? "Yes": "No");
    }
    static boolean isDate(int m, int d, int[] month){
        if(m > 0 && m < 13){
            if(month[m] < d || d < 1) return false;
            return true;
        }
        return false;
    }
}