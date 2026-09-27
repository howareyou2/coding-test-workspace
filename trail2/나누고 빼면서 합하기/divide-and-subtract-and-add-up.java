import java.util.Scanner;
public class Main {
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        result = arr[m];
        while(m != 1){
            m = progress(m, arr);
        }

        System.out.print(result);
    }

    static int progress(int m, int[] arr){
        if(m == 1) return m;

        if(m % 2 != 0){
            m -= 1;
        }else{
            m /= 2;
        }
        result += arr[m];
        return m;
    }
}