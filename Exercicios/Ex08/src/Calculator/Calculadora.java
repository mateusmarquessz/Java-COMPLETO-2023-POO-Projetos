package Calculator;

public class Calculadora {
    public static double calc(double DolarPrice, double DolarBought) {
        double result = DolarBought * DolarPrice;
        double increasedResult = result * 1.06; // Adicionando 6%
        return increasedResult;
    }
}
