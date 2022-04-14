package Exercicios;

import java.util.Scanner;

public class exercicio_05_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();
        if (x % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}
