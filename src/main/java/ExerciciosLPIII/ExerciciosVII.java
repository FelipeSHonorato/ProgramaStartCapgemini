package ExerciciosLPIII;

import java.util.Scanner;

public class ExerciciosVII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float grauCelcius = 0.0f;
        float Fahrenheit = 0.0f;
        float conversor = 0.0f;

        System.out.print("Digite a temperatura atual em graus celcius: ");
        grauCelcius = scanner.nextFloat();

        Fahrenheit = ((9 * grauCelcius + 160) / 5);

        System.out.println("A temperatura inserida em graus celcius é o equivalente a: " + Fahrenheit + " em fahrenheit");
    }
}
