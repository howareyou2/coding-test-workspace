import java.util.*;
public class Main {
    static class Student implements Comparable<Student>{
        String name;
        int height;
        int weight;

        Student(String n, int h, int w){
            this.name = n;
            this.height = h;
            this.weight = w;
        }

        @Override
        public int compareTo(Student other){
            return this.height - other.height;
        }

        @Override
        public String toString(){
            return name + " " + height + " " + weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(name[i], height[i], weight[i]);
        }
        
        Arrays.sort(students);

        for(Student s : students){
            System.out.println(s);
        }
    }
}