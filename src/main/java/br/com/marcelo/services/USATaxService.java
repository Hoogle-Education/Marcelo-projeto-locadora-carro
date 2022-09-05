package br.com.marcelo.services;

public class USATaxService {

    // R$ 200 > 12%
    // R$ 200 <= 15%

    public double tax(double valor) {

        if ( valor > 200.0 ) {
            return valor*0.12;
        }

        return valor*0.15;
    }

}
