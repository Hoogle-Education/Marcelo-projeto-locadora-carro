package br.com.marcelo.entities;

public class NotaFiscal {

    // private double valor;
    private double valorAluguel;
    private double valorImposto;

    public NotaFiscal() {
    }

    public NotaFiscal(double valorAluguel, double valorImposto) {
        this.valorAluguel = valorAluguel;
        this.valorImposto = valorImposto;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public double getValorTotal() {
        // return valorAluguel + valorImposto;
        return valorAluguel + valorImposto;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "valorAluguel=" + valorAluguel +
                ", valorImposto=" + valorImposto +
                ", valorTotal= " + getValorTotal() +
                '}';
    }
}
