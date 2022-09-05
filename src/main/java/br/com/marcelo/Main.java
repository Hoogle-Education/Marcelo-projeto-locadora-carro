package br.com.marcelo;

import br.com.marcelo.entities.AluguelCarro;
import br.com.marcelo.entities.Carro;
import br.com.marcelo.services.AluguelCarroService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate dataFrabricacao = LocalDate.parse("2018-01-01");
        LocalDateTime inicio = LocalDateTime.of(2022, 02, 10, 15, 30);
        LocalDateTime fim = LocalDateTime.of(2022, 02, 10, 16, 40);


        Carro car1 = new Carro("Joao", "Ford", dataFrabricacao);

        AluguelCarro aluguel = new AluguelCarro(inicio, fim, car1);

        System.out.println(aluguel);

        AluguelCarroService servicoDeAluguel = new AluguelCarroService(50.0, 230.0);

        servicoDeAluguel.processaNotaFiscal(aluguel);

        System.out.println(aluguel);

    }
}