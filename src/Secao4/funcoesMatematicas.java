package Secao4;

public class funcoesMatematicas {
    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raíz quadrada de " + x + " = " + a);
        System.out.println("Raíz quadrada de " + y + " = " + b);
        System.out.println("Raíz quadrada de 25 = " + c);
        // Potência
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.println(x + " Elevado a " + y + " = " + a);
        System.out.println(x + " Elevado ao quadrado = " + b);
        System.out.println("5 Elevado ao quadrado = " + c);
        // Valor Absoluto
        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de "+ z + " = " + b);
    }
}
