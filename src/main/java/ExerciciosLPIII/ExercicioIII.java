package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioIII {
    public static void main(String[] args) {

        // Exercício III proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);
        double qtdCombustivelAbastecido = 0;
        double distanciaPercorrida = 0;
        double consumoGasto = 0;

        System.out.print("Digite a quantidade de kilometros percorrida pelo automóvel: ");

        distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros de combustível gasto no percurso: ");

        qtdCombustivelAbastecido = scanner.nextDouble();

        consumoGasto = qtdCombustivelAbastecido / distanciaPercorrida;

        System.out.println("O automóvel consumiu: " + qtdCombustivelAbastecido + " litros em uma distância de " + distanciaPercorrida);

        System.out.println("O carro tem um consumo médio de " + consumoGasto + " litros por km");
    }
}