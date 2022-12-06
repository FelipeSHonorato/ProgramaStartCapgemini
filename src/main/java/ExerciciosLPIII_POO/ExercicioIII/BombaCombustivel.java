package ExerciciosLPIII_POO.ExercicioIII;

import java.math.BigDecimal;

public class BombaCombustivel {

    private String tipoCombustível;
    private BigDecimal valorPorLitro;
    private float qtdCombustivel;

    public BombaCombustivel(String tipoCombustível, BigDecimal valorPorLitro, float qtdCombustivel) {
        this.tipoCombustível = tipoCombustível;
        this.valorPorLitro = valorPorLitro;
        this.qtdCombustivel = qtdCombustivel;
    }

    public float abastecerPorValor(BigDecimal valorASerAbastecido) {
        float qtdCombustivelSolicitado = valorASerAbastecido.divide(valorPorLitro).floatValue();
        return qtdCombustivelSolicitado;
    }

    public BigDecimal abastecerPorLitro(float qtdCombustivel) {
        BigDecimal valorAPagar = valorPorLitro.multiply(BigDecimal.valueOf(qtdCombustivel));
        return valorAPagar;
    }

    public void alterarValor(BigDecimal valorPorLitro) {
        setValorPorLitro(valorPorLitro);
    }

    public void alterarCombustivel(String tipoCombustível) {
        setTipoCombustível(tipoCombustível);
    }

    public void alterarQuantidadeCombustivel(float qtdCombustivel) {
        setQtdCombustivel(getQtdCombustivel() + qtdCombustivel);
    }

    public String getTipoCombustível() {
        return tipoCombustível;
    }

    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }

    public BigDecimal getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(BigDecimal valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

}
