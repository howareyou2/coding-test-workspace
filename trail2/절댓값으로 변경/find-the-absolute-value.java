import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        absolute(arr);
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append(" ");
        }

        System.out.print(sb.toString());
    }

    static void absolute(int[] arr){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] < 0) arr[index] *= (-1);
        }
    }
}