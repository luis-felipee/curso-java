package exercicios;

import entities.Negativos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();
        Negativos []vect = new Negativos[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
            vect[i] = new Negativos(number);
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i<vect.length; i++){
            if (vect[i].getNumber() < 0){
                System.out.println(vect[i].getNumber());
            }
        }
        sc.close();
    }
}
