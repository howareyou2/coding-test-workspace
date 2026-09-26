import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(checkMinValue(a, b, c));
    }

    static int checkMinValue(int x, int y, int z){
        int one = Math.min(x, y);
        int result = Math.min(one, z);
        return result;
    }
}