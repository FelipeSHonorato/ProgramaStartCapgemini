package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioXXVII {

    public static void main(String[] args) {

        // Exercício XXVII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        BigDecimal valorCarro;
        BigDecimal valorTotal = new BigDecimal("0.0");
        BigDecimal valorDesconto = new BigDecimal("0.0");
        int tipoCombustivel;
        BigDecimal descontoAlcool= new BigDecimal("25");
        BigDecimal descontoGasolina = new BigDecimal("21");
        BigDecimal decontoDiesel = new BigDecimal("14");

        System.out.print("Insira o valor do automóvel: ");
        valorCarro = scanner.nextBigDecimal();

        System.out.println("Qual é o tipo de combustível do carro? ");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");

        System.out.print("Digite a opção desejada: ");
        tipoCombustivel = scanner.nextInt();

        switch (tipoCombustivel){
            case 1:
                valorDesconto = valorCarro.multiply(descontoAlcool.divide(BigDecimal.valueOf(100)));
                valorTotal = valorCarro.subtract(valorDesconto);
                break;
            case 2:
                valorDesconto = valorCarro.multiply(descontoGasolina.divide(BigDecimal.valueOf(100)));
                valorTotal = valorCarro.subtract(valorDesconto);
                break;
            case 3:
                valorDesconto = valorCarro.multiply(decontoDiesel.divide(BigDecimal.valueOf(100)));
                valorTotal = valorCarro.subtract(valorDesconto);
                break;
        }
        System.out.println("O valor do desconto é de: R$" + valorDesconto);
        System.out.println("O valor total de venda do veículo é de: R$" + valorTotal);
    }
}
