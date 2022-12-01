package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioIV {
    public static void main(String[] args) {

        // Exercício IV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor;
        BigDecimal salarioFixo;
        BigDecimal totalVendasDinheiroMes;
        BigDecimal porcentagemComissao = new BigDecimal("0.15");
        BigDecimal valorTotalComComissao;

        System.out.print("Digite o nome do vendedor: ");

        nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");

        salarioFixo = scanner.nextBigDecimal();

        System.out.print("Digite o valor total de vendas em dinheiro do vendedor: ");

        totalVendasDinheiroMes = scanner.nextBigDecimal();

        valorTotalComComissao = salarioFixo.add(((totalVendasDinheiroMes.multiply(porcentagemComissao))));

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo do vendedor: " + salarioFixo);
        System.out.println("Salário final do vendedor: " + valorTotalComComissao);

    }
}