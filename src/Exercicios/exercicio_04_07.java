package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04_07 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        triangulo = a * c / 2.0;
        circulo = Math.PI * c * c;
        trapezio = (a + b ) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;
        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);
        sc.close();
    }
}
