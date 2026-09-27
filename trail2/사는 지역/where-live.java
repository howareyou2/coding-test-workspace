import java.util.Scanner;
import java.util.*;

public class Main {

    static class Info{
        String name;
        String address;
        String region;

        Info(String name, String addr, String region){
            this.name = name;
            this.address = addr;
            this.region = region;
        }

        @Override
        public String toString(){
            return "name " + this.name
                +"\naddr " + this.address
                +"\ncity " + this.region;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] address = new String[n];
        String[] region = new String[n];

        Info[] infos = new Info[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            address[i] = sc.next();
            region[i] = sc.next();
            infos[i] = new Info(name[i], address[i], region[i]);
        }

        // Please write your code here.
        Arrays.sort(infos, (a, b) ->{
            return a.name.compareTo(b.name);
        });
        System.out.print(infos[n - 1]);
    }
}
