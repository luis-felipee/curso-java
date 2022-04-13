package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04_05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double salario, valorPorHora;
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorPorHora = sc.nextDouble();
        salario = valorPorHora * horas;
        System.out.println("NUMBER = " +  numero);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
