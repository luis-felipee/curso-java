package Exercicios;

import java.util.Scanner;

public class exercicio_05_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();
        if (x < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO!");
        }
        sc.close();
    }
}
