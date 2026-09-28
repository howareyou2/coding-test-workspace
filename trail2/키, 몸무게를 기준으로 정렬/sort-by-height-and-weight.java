import java.util.*;
public class Main {
    static class Person{
        String name;
        int height;
        int weight;

        Person(String n, int h, int w){
            this.name = n;
            this.height = h;
            this.weight = w;
        }

        @Override
        public String toString(){
            return name + " " + height + " "+ weight + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            people[i] = new Person(name[i], height[i], weight[i]);
        }

        // Please write your code here.

        Arrays.sort(people, (a, b)->{
            if(a.height == b.height) return b.weight - a.weight;
            return a.height - b.height;
        });

        StringBuilder sb = new StringBuilder();
        for(Person p : people){
            sb.append(p);
        }

        System.out.print(sb.toString());
    }
}
