package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXVI {

    public static void main(String[] args) {

        // Exercício XVI proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nome;
        float nota = 0.0f;
        float mediaAritmetica = 0.0f;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + " do aluno " + nome + ":");
            nota = scanner.nextFloat() + nota;
        }
        mediaAritmetica = nota / 3;

        if (mediaAritmetica >= 7) {
            System.out.print("O aluno " + nome + " está aprovado!");
        } else if (mediaAritmetica <= 5) {
            System.out.print("O aluno " + nome + " está reprovado!");
        } else System.out.println("O aluno " + nome + " está em recuperação!");
    }
}
