import java.util.*;
public class Main {
    static class Person{
        String name;
        int height;
        double weight;

        Person(String n, int h, double w){
            this.name = n;
            this.height = h;
            this.weight = w;
        }

        @Override
        public String toString(){
            return name + " " + height + " " + weight + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            people[i] = new Person(names[i], heights[i], weights[i]);
        }
        // Please write your code here.
        StringBuilder sb = new StringBuilder();

        Arrays.sort(people, (a, b)-> a.name.compareTo(b.name));
        sb.append("name\n");
        for(Person p: people){
            sb.append(p);
        }
        sb.append("\nheight\n");
        Arrays.sort(people, (a, b)->b.height - a.height);
        for(Person p: people){
            sb.append(p);
        }

        System.out.print(sb.toString());
    }
}