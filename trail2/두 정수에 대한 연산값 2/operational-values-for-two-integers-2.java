import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] numbers = new int[2];
        numbers[0] = a;
        numbers[1] = b;

        calculate(numbers);
        StringBuilder sb = new StringBuilder();
        for(int num: numbers){
            sb.append(num).append(" ");
        }

        System.out.print(sb.toString());
    }

    static void calculate(int[] nums){
        if(nums.length < 2) return;

        if(nums[0] > nums[1]){
            nums[1] += 10;
            nums[0] *= 2;
        }else{
            nums[0] += 10;
            nums[1] *= 2;
        }
        
    }
}