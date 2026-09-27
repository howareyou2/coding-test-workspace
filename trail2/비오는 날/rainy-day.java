import java.util.Scanner;
import java.util.*;

public class Main {
    static class Info{
        String date;
        String day;
        String weather;

        Info(String date, String day, String weather){
            this.date = date;
            this.day = day;
            this.weather = weather;
        }

        @Override
        public String toString(){
            return date + " " + day + " " + weather;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            infos[i] = new Info(date, day, weather);
        }
        
        Arrays.sort(infos, (a, b) -> a.date.compareTo(b.date));
        for(Info check : infos){
            if(check.weather.equals("Rain")) {
                System.out.print(check);
                return;
            }
        }
    }
}