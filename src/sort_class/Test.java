package sort_class;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        Product product1 = new Product(1, "TV", 1050);
        Product product2 = new Product(2, "Aaptop", 950);
        Product product3 = new Product(3, "Bphone", 500);

        list.add(product1);
        list.add(product2);
        list.add(product3);

        for (Product p : list) {
            System.out.println(p);
        }

        Collections.sort(list);
        System.out.println("Ds sau sap xep la");
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
