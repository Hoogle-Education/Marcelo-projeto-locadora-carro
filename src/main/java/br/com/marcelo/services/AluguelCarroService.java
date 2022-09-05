package br.com.marcelo.services;

import br.com.marcelo.entities.AluguelCarro;
import br.com.marcelo.entities.NotaFiscal;

public class AluguelCarroService {

    private double precoPorHora; // ate 23h 59min = paga a hora
    private double precoPorDia; // > paga a diaria
    private BrazilTaxService brazilTaxService;

    public AluguelCarroService() {
    }

    public AluguelCarroService(double precoPorHora, double precoPorDia) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void processaNotaFiscal(AluguelCarro aluguelCarro) {

        long checkInMinutes = aluguelCarro.getCheckIn().getDayOfYear()*24*60
                            + aluguelCarro.getCheckIn().getHour()*60
                            + aluguelCarro.getCheckIn().getMinute();


        long checkOutMinutes = aluguelCarro.getCheckOut().getDayOfYear()*24*60
                                + aluguelCarro.getCheckOut().getHour()*60
                                + aluguelCarro.getCheckOut().getMinute();

        long time = checkOutMinutes - checkInMinutes;

        double pagamentoBasico, pagamentoTaxa;

        if ( time/(60*24) >= 1) { // caso da diaria
            pagamentoBasico = Math.ceil( time/(60*24) ) * precoPorDia;
        } else { // caso das horas
            pagamentoBasico = Math.ceil( time/60 ) * precoPorHora;
        }

        pagamentoTaxa = brazilTaxService.tax(pagamentoBasico);

        aluguelCarro.setNotaFiscal( new NotaFiscal(pagamentoBasico, pagamentoTaxa) );

    }

}
