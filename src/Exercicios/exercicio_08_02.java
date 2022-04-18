package Exercicios;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08_02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee data = new Employee();

        System.out.print("Name: ");
        data.name = sc.nextLine();
        System.out.print("Gross salary: ");
        data.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        data.tax = sc.nextDouble();

        System.out.println("Employee: " + data);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        data.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated data: %s , $ %.2f%n", data.name, data.grossSalary);
        sc.close();
    }
}
