package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioX {
    public static void main(String[] args) {

        // Exercício X proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorProduto;
        int qtdPrestacoes = 5;
        BigDecimal valorPrestacoes;

        System.out.println("Bem vindo ao sistema da Loja Mamão com Açucar!");

        System.out.print("Por favor digite o valor do produto: R$");
        valorProduto = scanner.nextBigDecimal();

        valorPrestacoes = valorProduto.divide(BigDecimal.valueOf(qtdPrestacoes));

        System.out.println("Os valores das pretações ficaram em " + qtdPrestacoes + "x de R$" + valorPrestacoes);

    }
}
