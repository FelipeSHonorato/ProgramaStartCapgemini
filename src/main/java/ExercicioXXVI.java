import java.util.Scanner;

public class ExercicioXXVI {
    public static void main(String[] args) {

        // Exercício XXVI proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean confirmacao = false;

        while (confirmacao != true) {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 5) {
                System.out.println("Número inválido!");
            } else {
                switch (numero) {
                    case 1:
                        System.out.println("Um");
                        confirmacao = true;
                        break;
                    case 2:
                        System.out.println("Dois");
                        confirmacao = true;
                        break;
                    case 3:
                        System.out.println("Três");
                        confirmacao = true;
                        break;
                    case 4:
                        System.out.println("Quatro");
                        confirmacao = true;
                        break;
                    case 5:
                        System.out.println("Cinco");
                        confirmacao = true;
                        break;
                }
            }
        }
    }
}
