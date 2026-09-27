import java.util.Scanner;
public class Main {
    static class Product{
        String name;
        int code;

        Product(String name, int code){
            this.name = name;
            this.code = code;
        }

        @Override
        public String toString(){
            return "product " + this.code + " is " + name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product[] products = new Product[2];
        products[0] = new Product("codetree", 50);
        products[1] = new Product(id2, code2);

        for(Product p : products){
            System.out.println(p);
        }
    }
}