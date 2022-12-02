package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXI {
    public static void main(String[] args) {

        // Exercício XXI proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        char problemasSaude;
        int naoAptos = 0;
        int aptos = 0;

        System.out.println("Bem vindo ao sistema de cadastramento do Serviço Militar Obrigatório!");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do convocado: ");
            nome = scanner.next();

            System.out.print("Digite a idade do convocado: ");
            idade = scanner.nextInt();

            sexo = 0;
            problemasSaude = 0;

            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Digite o sexo dessa pessoa (M para masculino e F para feminino): ");
                sexo = scanner.next().charAt(0);
                sexo = Character.toUpperCase(sexo);

                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Você digitou sexo errado, digite M para masculino ou F para feminino.");
                }
            }

            while (problemasSaude != 'S' && problemasSaude != 'N') {
                System.out.print("O convocado tem algum problema de saúde? (S para sim ou N para não): ");
                problemasSaude = scanner.next().charAt(0);
                problemasSaude = Character.toUpperCase(problemasSaude);

                if (problemasSaude != 'S' && problemasSaude != 'N') {
                    System.out.println("Você digitou errado a situação da saúde do convocado, " +
                            "digite S para sim ou N para não.");
                }
            }
            if (sexo == 'F' || problemasSaude == 'S' || idade < 18) {
                System.out.println("O convocado " + nome + " não está apto para cumprir o serviço militar obrigatório!");
                naoAptos++;
            } else {
                System.out.println("O convocado " + nome + " está apto para cumprir o serviço militar obrigatório!");
                aptos++;
            }
        }
        System.out.println("Foram convocadas para serviço militar obrigatório " + aptos + " pessoas");
        System.out.println("Foram dispensadas do serviço militar obrigatório " + naoAptos + " pessoas");
    }
}
