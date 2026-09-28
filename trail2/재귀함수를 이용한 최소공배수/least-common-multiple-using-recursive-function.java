import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(lcm(arr, arr.length));
    }

    static int lcm(int[] arr, int index){
        if(index == 1) return arr[0];
        
        return calculateLcm(lcm(arr, index - 1), arr[index - 1]);
    }

    static int calculateLcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}