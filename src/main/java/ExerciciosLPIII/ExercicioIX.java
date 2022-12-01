package ExerciciosLPIII;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioIX {
    public static void main(String[] args) {

        // Exercício IX proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorDepositado;
        BigDecimal porcentagemRendimentoMes = new BigDecimal("0.07");
        BigDecimal valorAposRedimento;

        System.out.print("Informe o valor depositado para rendimento: R$");
        valorDepositado = scanner.nextBigDecimal();

        valorAposRedimento = valorDepositado
                .add(valorDepositado.multiply(porcentagemRendimentoMes
                        .divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("O rendimento total foi de: R$" + valorAposRedimento);

    }
}

