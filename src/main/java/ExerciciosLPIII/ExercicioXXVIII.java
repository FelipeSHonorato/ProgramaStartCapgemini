package ExerciciosLPIII;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioXXVIII {
    public static void main(String[] args) {

        // Exercício XXVIII proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int qtdFuncionarios = 3;
        String nomeFuncionario;
        BigDecimal salarioFuncionario;
        BigDecimal valorReajuste;
        BigDecimal totalAntigaFolhaPagamento = new BigDecimal("0.0");
        BigDecimal totalNovaFolhaPagamento = new BigDecimal("0.0");
        BigDecimal valorSalarioMinimo = new BigDecimal("1212.00");
        BigDecimal porcentagemReajusteMenosTresSalarios = new BigDecimal("50");
        BigDecimal porcentagemReajusteAteDezSalarios = new BigDecimal("20");
        BigDecimal porcentagemReajusteAteVinteSalarios = new BigDecimal("15");
        BigDecimal porcentagemReajusteOutros = new BigDecimal("10");

        for (int i = 0; i <= qtdFuncionarios; i++) {

            salarioFuncionario = new BigDecimal("0.0");

            System.out.print("Digite o nome do funcionário: ");
            nomeFuncionario = scanner.next();

            System.out.print("Digite o salário atual do funcionário: R$");
            salarioFuncionario = scanner.nextBigDecimal();

            totalAntigaFolhaPagamento = totalAntigaFolhaPagamento.add(salarioFuncionario);

            //Variáveis para controle de condicionais do aumento do salário.
            BigDecimal maxTresSalarios = valorSalarioMinimo.multiply(BigDecimal.valueOf(3));
            BigDecimal tresADezSalarios = valorSalarioMinimo.multiply(BigDecimal.valueOf(10));
            BigDecimal dezAVinteSalarios = valorSalarioMinimo.multiply(BigDecimal.valueOf(20));

            if (salarioFuncionario.intValue() < maxTresSalarios.intValue()) {
                valorReajuste = salarioFuncionario.multiply(porcentagemReajusteMenosTresSalarios
                        .divide(BigDecimal.valueOf(100)));
                salarioFuncionario = salarioFuncionario.add(valorReajuste);

            } else if (salarioFuncionario.intValue() >= maxTresSalarios.intValue()
                    && salarioFuncionario.intValue() <= tresADezSalarios.intValue()) {
                valorReajuste = salarioFuncionario.multiply(porcentagemReajusteAteDezSalarios
                        .divide(BigDecimal.valueOf(100)));
                salarioFuncionario = salarioFuncionario.add(valorReajuste);

            } else if (salarioFuncionario.intValue() > tresADezSalarios.intValue()
                    && salarioFuncionario.intValue() <= dezAVinteSalarios.intValue()) {
                valorReajuste = salarioFuncionario.multiply(porcentagemReajusteAteVinteSalarios
                        .divide(BigDecimal.valueOf(100)));
                salarioFuncionario = salarioFuncionario.add(valorReajuste);

            } else {
                valorReajuste = salarioFuncionario.multiply(porcentagemReajusteOutros
                        .divide(BigDecimal.valueOf(100)));
                salarioFuncionario = salarioFuncionario.add(valorReajuste);
            }
            totalNovaFolhaPagamento = totalNovaFolhaPagamento.add(salarioFuncionario);
            System.out.println("O funcionário " + nomeFuncionario + " terá um reajuste em seu salário no valor de R$"
                    + valorReajuste + ", seu novo salário será de: R$" + salarioFuncionario);
        }
        System.out.println("A empresa tem hoje uma folha de pagamento de: R$" + totalAntigaFolhaPagamento);
        System.out.println("Com os reajustes de salários a nova folha de pagamento tera um aumento de R$"
                + (totalNovaFolhaPagamento.subtract(totalAntigaFolhaPagamento)));
    }
}

