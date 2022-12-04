package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXXIV {
    public static void main(String[] args) {

        // Exercício XXXIV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        System.out.print("Insira a idade do nadador: ");

        if (idade > 5 && idade < 7) {
            System.out.println("O nadador está classificado na categoria Infantil A");
        } else if (idade > 8 && idade < 10) {
            System.out.println("O nadador está classificado na categoria Infantil B");
        } else if (idade > 11 && idade < 13) {
            System.out.println("O nadador está classificado na categoria Juvenil A");
        } else if (idade > 14 && idade < 17) {
            System.out.println("O nadador está classificado na categoria Juvenil B");
        } else if (idade > 18 && idade < 25) {
            System.out.println("O nadador está classificado na categoria Infantil B");
        } else {
            System.out.println("Idade do nadador fora da faixa etária");
        }
    }
}
