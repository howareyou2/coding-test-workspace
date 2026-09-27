import java.util.Scanner;

public class Main {
    static class IntegerWrapper{
        int value;
        IntegerWrapper(int num){
            this.value = num;
        }

        @Override
        public String toString(){
            return Integer.toString(this.value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntegerWrapper num1 = new IntegerWrapper(n);
        IntegerWrapper num2 = new IntegerWrapper(m);
        swap(num1, num2);
        System.out.printf(num1 +" "+ num2);

    }

    static void swap(IntegerWrapper a, IntegerWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}