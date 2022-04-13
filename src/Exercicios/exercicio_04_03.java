package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04_03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, area;

        x = sc.nextDouble();
        area = Math.PI * Math.pow(x, 2);
        System.out.printf("A= %.4f%n", area);

    }
}
