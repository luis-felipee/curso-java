package entities;

public class CurrencyConverter {
    public static double dolar, quantity;
    public static double calculator(){
        return dolar * quantity + (dolar * quantity * 6 / 100);
    }

}
