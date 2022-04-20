package Exercicios;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09_01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit(y/n)? ");
        char response = sc.next().charAt(0);


        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(accountNumber, accountHolder, initialDeposit);
        }
        else {
            account = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println("Account " + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println("Account: " + account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withDraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
