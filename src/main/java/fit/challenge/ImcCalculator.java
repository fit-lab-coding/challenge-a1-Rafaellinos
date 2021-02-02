package fit.challenge;

public class ImcCalculator {

    public static String calculate(double peso, double altura) {
        double massa = peso / Math.pow(altura, 2);
        if (massa <= 18.49) {
            return "Magreza";
        } else if (massa >= 18.5 && massa <= 24.99) {
            return "Normal";
        } else if (massa >= 25 && massa <= 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
