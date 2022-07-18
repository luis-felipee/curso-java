package exercicios;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        People []vect = new People[n];
        double soma = 0.0;
        double menosSixteen = 0;
        int count = 0;
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa: ");

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            soma += altura;

            vect[i] = new People(name, idade, altura);
        }

        double avg = soma / vect.length;
        System.out.printf("Altura média %.2f%n", avg);

        for (int i = 0; i <vect.length; i++){
            if (vect[i].getIdade() < 16 ){
                count+=1;
            }
        }
        double percent = count * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percent);

        for (int i = 0; i <vect.length; i++){
            if (vect[i].getIdade() < 16 ){
                System.out.println(vect[i].getName());
            }
        }


    }
}
