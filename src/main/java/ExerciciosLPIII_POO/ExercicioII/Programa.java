package ExerciciosLPIII_POO.ExercicioII;

import java.math.BigDecimal;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente(1, "Felipe", new BigDecimal("0.0"));

        String menu = "S";
        int opcoes;

        while (menu == "S") {

            System.out.println("Olá "+ contaCorrente.getNomeCorrentista() + ".Bem vindo ao Sistema Bancário! ");
            System.out.println("1 - Alterar nome do correntista");
            System.out.println("2 - Efetuar um depósito");
            System.out.println("3 - Efetuar um saque");
            System.out.println("4 - Ver saldo atual da conta");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1: {
                    System.out.print("Digite o nome na qual vc deseja alterar: ");
                    contaCorrente.alterarNome(scanner.next());
                    break;
                }
                case 2: {
                    System.out.print("Digite o valor do depósito: ");
                    contaCorrente.deposito(scanner.nextBigDecimal());
                    break;
                }
                case 3: {
                    System.out.print("Digite o valor do saque: ");
                    contaCorrente.saque(scanner.nextBigDecimal());
                    break;
                }
                case 4: {
                    System.out.print("Seu saldo atual é de : R$" + contaCorrente.getSaldo() + " reais.");
                    System.out.println("");
                    break;
                }
                case 5: {
                    menu = "N";
                    break;
                }
                default:
                    System.out.println("Você digitou um opção inválida!");
            }
        }
    }
}
