package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXX {
    public static void main(String[] args) {

        // Exercício XX proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        float valorCarro = 0.0f;
        int anoFabricacao = 0;
        char desejaRepetir = 's';
        float valorDesconto = 0.0f;
        float porcentagemCarrosAntigos = 0.12f;
        float porcentagemCarrosSemiNovos = 0.07f;
        int totalCarros = 0;
        int totalCarrosSemiNovos = 0;

        System.out.println("Bem vindo ao sistema de cadastro de carros da CARANGO VELHO");

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano da fabricação do carro: ");
            anoFabricacao = scanner.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorCarro = scanner.nextFloat();

            if (anoFabricacao <= 2000) {
                valorDesconto = valorCarro * porcentagemCarrosAntigos;
            } else {
                valorDesconto = valorCarro * porcentagemCarrosSemiNovos;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            System.out.println("O valor do desconto aplicado foi de: R$" + valorDesconto);
            System.out.println("O valor do veículo com desconto é: R$" + (valorCarro - valorDesconto));

            System.out.println("Deseja calcular um novo veículo? (Digite 's' para sim ou 'n' para sair.)");
            desejaRepetir = scanner.next().charAt(0);
        }
        System.out.println("O total de carros calculados é de: " + totalCarros + " carros.");
        System.out.println("O total de carros seminovos é de: " + totalCarrosSemiNovos + " carros.");
        System.out.println("Fim do programa!");
    }
}
