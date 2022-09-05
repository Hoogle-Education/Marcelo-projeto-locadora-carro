package br.com.marcelo.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

    // atributos
    private LocalDateTime checkOut;
    private LocalDateTime checkIn;
    private Carro carroAlugado;
    private NotaFiscal notaFiscal = new NotaFiscal();

    // construtor padrão
    public AluguelCarro() {
    }

    // construtor personalizado
    public AluguelCarro(LocalDateTime checkIn, LocalDateTime checkOut, Carro carroAlugado) {
        this.checkOut = checkOut;
        this.checkIn = checkIn;
        this.carroAlugado = carroAlugado;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public String toString() {
        return "AluguelCarro{" +
                "checkOut=" + checkOut +
                ", checkIn=" + checkIn +
                ", carroAlugado=" + carroAlugado +
                ", notaFiscal=" + notaFiscal +
                '}';
    }
}
