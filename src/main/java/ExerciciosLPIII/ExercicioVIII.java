package ExerciciosLPIII;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioVIII {

    public static void main(String[] args) {

        // Exercício VIII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorReal;
        BigDecimal valorDolar;
        BigDecimal cotacaoDolarTurismo;

        System.out.print("Digite a quantidade de reais que deseja converter: R$");
        valorReal = scanner.nextBigDecimal();

        System.out.print("Digite a cotação atual do dólar turismo em relação ao real: R$");
        cotacaoDolarTurismo = scanner.nextBigDecimal();

        valorDolar = valorReal.divide(cotacaoDolarTurismo,new MathContext(4, RoundingMode.HALF_UP));

        System.out.println("A quantidade de dólares que serão convertidos será: US$" + valorDolar);
    }
}
