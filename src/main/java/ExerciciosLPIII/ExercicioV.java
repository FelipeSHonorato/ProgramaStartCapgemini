package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioV {
    public static void main(String[] args) {

        // Exercício V proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        int qtdNotas = 3;
        double[] notas = new double[qtdNotas];
        double somaNotas = 0;

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = scanner.nextLine();

        for (int i = 0; i <= (qtdNotas-1); i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas = somaNotas + notas[i];
        }

        System.out.print("A média do aluno " + nomeAluno + " é: " + (somaNotas/qtdNotas));
    }
}
