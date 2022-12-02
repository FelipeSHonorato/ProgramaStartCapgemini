package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXIX {
    public static void main(String[] args) {

        // Exercício XIX proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nome;
        int qtdMasculino = 0;
        int qtdFeminino = 0;
        char sexo = 0;

        for (int i = 0; i < 56; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = scanner.next();
            sexo = 0;

            while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
                System.out.print("Digite o sexo dessa pessoa (M para masculino e F para feminino): ");
                sexo = scanner.next().charAt(0);

                if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
                    System.out.println("Você digitou sexo errado, digite M para masculino ou F para feminino.");
                }
            }

            if (sexo == 'M' || sexo == 'm') {
                System.out.println("O " + nome + " é do sexo masculino!");
                qtdMasculino++;
            } else {
                System.out.println("A " + nome + " é do sexo feminino!");
                qtdFeminino++;
            }
        }
        System.out.println("Foram computados um total de " + qtdMasculino + " homens e " + qtdFeminino + " mulheres.");
    }
}
