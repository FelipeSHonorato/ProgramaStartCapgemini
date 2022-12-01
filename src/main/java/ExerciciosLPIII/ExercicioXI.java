package ExerciciosLPIII;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioXI {
    public static void main(String[] args) {

        // Exercício XI proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorCusto;
        BigDecimal porcentagemVenda;
        BigDecimal valorVenda;

        System.out.print("Insira o valor de custo do produto: R$");
        valorCusto = scanner.nextBigDecimal();

        System.out.print("Insira a porcetagem de venda do produto: ");
        porcentagemVenda = scanner.nextBigDecimal();

        valorVenda = valorCusto.add(valorCusto.multiply(porcentagemVenda
                        .divide(BigDecimal.valueOf(100)))
                .setScale(2, RoundingMode.HALF_UP));

        System.out.println("O valor final de venda do produto é: R$" + valorVenda);
    }
}
