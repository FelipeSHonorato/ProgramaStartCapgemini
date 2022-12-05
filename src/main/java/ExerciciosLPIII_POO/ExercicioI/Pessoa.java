package ExerciciosLPIII_POO.ExercicioI;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private Calendar cal = Calendar.getInstance();
    private float altura = 0.0f;
    private int anoNascimento;
    private int anoAtual = cal.get(Calendar.YEAR);
    private int idade;

    public Pessoa() {
    }

    public void calcularIdade(){
        idade = anoAtual - anoNascimento;
        setIdade(idade);
    }

    public void fichaPessoa(){
        System.out.println("Ficha completa da pessoa registrada:");
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade + " anos");
        System.out.println("Altura da pessoa: " + altura + " metros");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
