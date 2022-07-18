package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?: ");
        int n = sc.nextInt();
        Double vect[] = new Double[n];
        double soma = 0;
        for (int i = 0; i<vect.length; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.print("VALORES = ");
        for (int i = 0; i <vect.length; i++){
            System.out.printf("%.2f  ", vect[i]);
        }
        System.out.println();
        double avg = soma / vect.length;
        System.out.printf("SOMA = %.2f%n",  soma);
        System.out.printf("MEDIA = %.2f%n", avg);
        sc.close();
    }
}
