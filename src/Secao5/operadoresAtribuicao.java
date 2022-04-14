package Secao5;

import java.util.Locale;
import java.util.Scanner;

public class operadoresAtribuicao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutos;
        double conta = 50.0;
        minutos = sc.nextInt();
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
            System.out.printf("Valor a pagar: %.2f", conta);
        }
        else{
            System.out.printf("Valor a pagar: %.2f", conta);
        }
        sc.close();
    }
}
