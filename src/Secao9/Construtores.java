package Secao9;

import entities.ProductConstrutor;

import java.util.Locale;
import java.util.Scanner;

public class Construtores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ProductConstrutor p = new ProductConstrutor();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();

        ProductConstrutor product = new ProductConstrutor(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Product data: " + product);


        sc.close();
    }
}
