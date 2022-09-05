package br.com.marcelo.services;

public class BrazilTaxService {

    // R$ 150 > 10%
    // R$ 150 <= 12%

    public double tax(double valor) {

        if ( valor > 150.0 ) {
            return valor*0.1;
        }

        return valor*0.12;
    }

}
