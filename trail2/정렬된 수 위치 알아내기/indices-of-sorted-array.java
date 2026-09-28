import java.util.*;

public class Main {
    static class Element implements Comparable<Element>{
        int value;
        int initOrder;

        Element(int v, int o){
            this.value = v;
            this.initOrder = o;
        }

        @Override
        public int compareTo(Element other){
            return this.value - other.value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Element[] elements = new Element[n];
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            elements[i] = new Element(arr[i], i);
        }
        // Please write your code here.
        StringBuilder sb = new StringBuilder();
        Arrays.sort(elements);
        for(int index = 0; index < n; index++){
            result[elements[index].initOrder] = index + 1;
        }
        for(int count : result){
            sb.append(count).append(" ");
        }

        System.out.print(sb.toString());
    }
}