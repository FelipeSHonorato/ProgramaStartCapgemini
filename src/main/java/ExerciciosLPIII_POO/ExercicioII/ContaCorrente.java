package ExerciciosLPIII_POO.ExercicioII;

import java.math.BigDecimal;

public class ContaCorrente {

    private int numeroConta;
    private String nomeCorrentista;
    private BigDecimal saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String nomeCorrentista){
        System.out.println("Digite o novo nome para o correntista: ");
        setNomeCorrentista(nomeCorrentista);
    }

    public void deposito(BigDecimal deposito){
        System.out.println("Digite o valor do depósito: ");
        setSaldo(saldo.add(deposito));
    }

    public void saque(BigDecimal saque){
        System.out.println("Digite o valor do saque: ");
        setSaldo(saldo.subtract(saque));
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        if (saldo.intValue() < 0){
            setSaldo(new BigDecimal ("0.0"));
        }
        this.saldo = saldo;
    }
}
