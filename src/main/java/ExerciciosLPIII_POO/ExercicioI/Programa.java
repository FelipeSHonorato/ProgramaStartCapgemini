package ExerciciosLPIII_POO.ExercicioI;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Digite a altura da pessoa (ex.: 1,82): ");
        pessoa.setAltura(scanner.nextFloat());

        System.out.print("Digite o ano de nascimento da pessoa (ex. 1984): ");
        pessoa.setAnoNascimento(scanner.nextInt());

        pessoa.calcularIdade();

        pessoa.fichaPessoa();

    }

}
