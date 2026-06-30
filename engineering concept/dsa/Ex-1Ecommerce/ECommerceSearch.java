

import java.util.Scanner;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ECommerceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] p = {
                new Product(101, "Laptop"),
                new Product(102, "Mobile"),
                new Product(103, "Watch"),
                new Product(104, "Shoes"),
                new Product(105, "Bag")
        };

        System.out.print("Enter Product ID: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < p.length; i++) {
            if (p[i].id == key) {
                System.out.println("Product Found");
                System.out.println("ID : " + p[i].id);
                System.out.println("Name : " + p[i].name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
        sc.close();
    }
}
