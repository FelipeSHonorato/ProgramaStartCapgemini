package ExerciciosLPIII_POO.ExercicioIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class Sistema {

    public void iniciarSistema() {
        Scanner scanner = new Scanner(System.in);

        String menu = "S";
        int opcoes;

        BombaCombustivel bombaCombustivel = new BombaCombustivel("Alcool", new BigDecimal("3.95")
                , 250);

        while (menu == "S") {

            System.out.println("Bem vindo ao Sistema de Controle da Bomba de Combustível! O que deseja fazer?");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar o valor do litro do combustível");
            System.out.println("4 - Alterar o tipo de combustível da bomba");
            System.out.println("5 - Ver quantidade de litros de combustível da bomba");
            System.out.println("6 - Adicionar combustível na bomba");
            System.out.println("7 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1: {
                    System.out.print("Digite o valor na qual você deseja abastecer: R$");
                    BigDecimal valorPagar = scanner.nextBigDecimal();
                    float qtdLitrosAbastecidos = bombaCombustivel.abastecerPorValor(valorPagar);
                    System.out.println("Foram abastecidos " + qtdLitrosAbastecidos + " litros");
                    break;
                }
                case 2: {
                    System.out.print("Digite a quantidade de litros na qual você deseja abastecer: ");
                    float qtdLitrosAbastecidos = scanner.nextFloat();
                    BigDecimal valorTotalAPagar = bombaCombustivel.abastecerPorLitro(qtdLitrosAbastecidos);
                    System.out.println("O total a pagar é R$" + valorTotalAPagar);
                    break;
                }
                case 3: {
                    System.out.print("Digite o novo valor do litro do combustível: R$");
                    BigDecimal novoValor = scanner.nextBigDecimal();
                    BigDecimal valorAntigo = bombaCombustivel.getValorPorLitro();
                    bombaCombustivel.alterarValor(novoValor);
                    System.out.println("O valor do combustível foi alterado de: R$"
                            + valorAntigo + " para: R$" + bombaCombustivel.getValorPorLitro());
                    break;
                }
                case 4: {
                    System.out.print("Digite o novo tipo de combustível da bomba: ");
                    String novoTipoCombustivel = scanner.next();
                    String antigoTipoCombustivel = bombaCombustivel.getTipoCombustível();
                    bombaCombustivel.alterarCombustivel(novoTipoCombustivel);
                    System.out.println("Modificado o tipo de combustível de: "
                            + antigoTipoCombustivel + " para: " + bombaCombustivel.getTipoCombustível());
                    break;
                }
                case 5: {
                    float qtdCombustivelBomba = bombaCombustivel.getQtdCombustivel();
                    String tipoCombustivel = bombaCombustivel.getTipoCombustível();
                    System.out.println("A bomba tem: " + qtdCombustivelBomba + " litros de " + tipoCombustivel);
                    break;
                }
                case 6: {
                    System.out.print("Digite quantidade de combustível a ser adicionado na bomba: ");
                    float qtdCombustivelAdicionado = scanner.nextFloat();
                    bombaCombustivel.alterarQuantidadeCombustivel(qtdCombustivelAdicionado);
                    System.out.println("Adicionado " + qtdCombustivelAdicionado + " litros de "
                            + bombaCombustivel.getTipoCombustível() + " na bomba");
                    System.out.println("Total de combustível no momento é de: "
                            + bombaCombustivel.getQtdCombustivel() + " litros");
                    break;
                }
                case 7: {
                    menu = "N";
                    break;
                }
                default:
                    System.out.println("Você digitou um opção inválida!");
            }
        }
    }
}
