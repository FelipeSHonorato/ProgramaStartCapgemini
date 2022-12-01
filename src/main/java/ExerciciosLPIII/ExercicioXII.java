package ExerciciosLPIII;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioXII {

    public static void main(String[] args) {

        // Exercício XII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner= new Scanner(System.in);

        BigDecimal custoFabrica;
        BigDecimal percentualDistribuidor = new BigDecimal("28");
        BigDecimal custoPercentual;
        BigDecimal impostos = new BigDecimal("45");
        BigDecimal custoImposto;
        BigDecimal custoTotal;

        System.out.print("Informe o custo de fábrica do automóvel: R$");
        custoFabrica = scanner.nextBigDecimal();

        custoImposto = custoFabrica.add(custoFabrica.multiply(impostos.divide(BigDecimal.valueOf(100))));
        custoPercentual = custoImposto.add(custoImposto
                .multiply(percentualDistribuidor
                        .divide(BigDecimal.valueOf(100))))
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Custo final do automóvel com impostos e porcentagem do distribuidor é: R$" + custoPercentual);
    }
}
