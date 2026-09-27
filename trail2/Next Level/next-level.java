import java.util.Scanner;

public class Main {
    static class Info{
        String id;
        int level;

        Info(String id, int level){
            this.id = id;
            this.level = level;
        }
        
        @Override
        public String toString() {
            return "user " + this.id +" lv " + level+ "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        Info x = new Info("codetree", 10);
        Info y = new Info(id, level);

        System.out.print(x);
        System.out.print(y);

    }
}