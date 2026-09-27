import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] numbers = new int[2];
        numbers[0] = a;
        numbers[1] = b;

        check(numbers);

        System.out.printf("%d %d", numbers[0], numbers[1]);
    }

    static void check(int[] nums){
        if(nums.length < 2) return;

        if(nums[0] > nums[1]){
            nums[0] += 25;
            nums[1] *= 2;
        }else{
            nums[1] += 25;
            nums[0] *= 2;
        }
    }
}