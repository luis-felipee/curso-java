package Exercicios;

import java.util.Scanner;

public class exercicio_06_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();
        while (senha != 2002){
            System.out.println("Senha Inválida!");
            System.out.print("Digite novamente: ");
            senha = sc.nextInt();

        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
