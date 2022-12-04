package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExerciciosXXXV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal consumoMesAtualKwh;
        int tipoCliente = 0;
        BigDecimal custoKwhResidencial = new BigDecimal("0.60");
        BigDecimal custoKwhComercial = new BigDecimal("0.48");
        BigDecimal custoKwhIndustrial = new BigDecimal("1.29");
        BigDecimal valorTotal;

        System.out.println("Insira o consumo total do mês em kwh: ");
        consumoMesAtualKwh = scanner.nextBigDecimal();

        while (tipoCliente != 1 && tipoCliente != 2 && tipoCliente != 3) {
            System.out.print("Digite seu tipo de cliente (1 - Residencial / 2 - Comercial / 3 - Industrial): ");
            tipoCliente = scanner.nextInt();

            switch (tipoCliente) {
                case 1: {
                    valorTotal = consumoMesAtualKwh.multiply(custoKwhResidencial);
                    System.out.println("O valor a ser pago é: R$" + valorTotal);
                    break;
                }
                case 2: {
                    valorTotal = consumoMesAtualKwh.multiply(custoKwhComercial);
                    System.out.println("O valor a ser pago é: R$" + valorTotal);
                    break;
                }
                case 3: {
                    valorTotal = consumoMesAtualKwh.multiply(custoKwhIndustrial);
                    System.out.println("O valor a ser pago é: R$" + valorTotal);
                    break;
                }
                default:
                    System.out.println("Tipo de cliente inválido!");
            }
        }
    }
}
