import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        class Info{
            String secretCode;
            char meetingPoint;
            int time;

            Info(String sCode, char mPoint, int time){
                this.secretCode = sCode;
                this.meetingPoint = mPoint;
                this.time = time;
            }

            @Override
            public String toString() {
                return "secret code : " + this.secretCode + "\nmeeting point : " + this.meetingPoint + "\ntime : " + time;
            }
        }

        Info info = new Info(sCode, mPoint, time);
        System.out.print(info);
    }
}