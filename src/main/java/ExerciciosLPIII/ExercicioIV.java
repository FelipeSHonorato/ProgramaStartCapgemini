package ExerciciosLPIII;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExercicioIV {
    public static void main(String[] args) {

        // Exercício IV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor;
        BigDecimal salarioFixo;
        BigDecimal totalVendasDinheiroMes;
        BigDecimal porcentagemComissao = new BigDecimal("15");
        BigDecimal valorTotalComComissao;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: R$");
        salarioFixo = scanner.nextBigDecimal();

        System.out.print("Digite o valor total de vendas em dinheiro do vendedor: R$");

        totalVendasDinheiroMes = scanner.nextBigDecimal();

        valorTotalComComissao = salarioFixo
                .add(((totalVendasDinheiroMes
                        .multiply(porcentagemComissao)
                        .divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_EVEN));

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo do vendedor: R$" + salarioFixo);
        System.out.println("Salário final do vendedor: R$" + valorTotalComComissao);

    }
}