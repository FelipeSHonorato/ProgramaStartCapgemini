package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXII {
    public static void main(String[] args) {

        // ExercícioXXII proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        int i = 0;
        for (; i < 2; i++) {

            System.out.println("Digite o NOME do produto");
            nomeProduto = scanner.next();

            System.out.println("Digite o preço de CUSTO do produto");
            precoCusto = scanner.nextFloat();

            System.out.println("Digite o preço de VENDA do produto");
            precoVenda = scanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            System.out.println("");
            if (precoCusto == precoVenda) {
                System.out.println("O produto " + nomeProduto + " não está dando lucro nem prejuízo");
            } else {
                if (precoCusto < precoVenda) {
                    System.out.println("O produto " + nomeProduto + " está dando lucro");
                } else System.out.println("O produto " + nomeProduto + " está dando prejuízo");
            }
            System.out.println("");
            System.out.println(nomeProduto + ", preco de custo = " + precoCusto + ", preco de venda = " + precoVenda);
        }

        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / i));
    }
}
