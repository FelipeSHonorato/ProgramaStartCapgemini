package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioXXXIV {
    public static void main(String[] args) {

        // Exercício XXXIV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nome;
        int nivelProfessor = 0;
        BigDecimal custoHoraProfessorNivelUm = new BigDecimal("12.00");
        BigDecimal custoHoraProfessorNivelDois = new BigDecimal("17.00");
        BigDecimal custoHoraProfessorNivelTres = new BigDecimal("25.00");
        BigDecimal salarioTotal;
        BigDecimal horasAulas;

        System.out.println("Bem vindo ao sistema da escola APRENDER!");

        System.out.print("Insira o nome do professor: ");
        nome = scanner.next();

        System.out.print("Insira a quantidade de horas de aulas ministradas pelo professor: ");
        horasAulas = scanner.nextBigDecimal();

        while (nivelProfessor != 1 && nivelProfessor != 2 && nivelProfessor != 3) {
            System.out.println("Insira o nível do professor (1 - Nível1 / 2 - Nível2 / 3 - Nível3: ");
            nivelProfessor = scanner.nextInt();

            switch (nivelProfessor) {
                case 1: {
                    salarioTotal = horasAulas.multiply(custoHoraProfessorNivelUm);
                    System.out.println("O(A) professor(a) " + nome + " deverá receber um salário de: R$" + salarioTotal);
                    break;
                }
                case 2: {
                    salarioTotal = horasAulas.multiply(custoHoraProfessorNivelDois);
                    System.out.println("O(A) professor(a) " + nome + " deverá receber um salário de: R$" + salarioTotal);
                    break;
                }
                case 3: {
                    salarioTotal = horasAulas.multiply(custoHoraProfessorNivelTres);
                    System.out.println("O(A) professor(a) " + nome + " deverá receber um salário de: R$" + salarioTotal);
                    break;
                }
                default:
                    System.out.println("O nível do professor está incorreto!");
            }
        }
    }
}
