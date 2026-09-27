import java.util.Scanner;
public class Main {
    static class Info{
        String clearCode;
        char lineColor;
        int time;

        Info(String code, char color, int time){
            this.clearCode = code;
            this.lineColor = color;
            this.time = time;
        }

        @Override
        public String toString(){
            return "code : " + clearCode
                + "\ncolor : " + lineColor
                + "\nsecond : " + time;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Info info = new Info(uCode, lColor, time);
        System.out.print(info);

    }
}