package dev.marksduarte.strategy;

import dev.marksduarte.strategy.classes.ICMS;
import dev.marksduarte.strategy.classes.ISS;
import dev.marksduarte.strategy.enums.ImpostoEnum;

import java.math.BigDecimal;

public class TesteStrategy {
    public static void main(String[] args) {
        var calculadora = new CalculadoraImposto();
        System.out.println("Strategy com Classe: ");
        System.out.println("ICMS: " + calculadora.calcular(new ICMS(), BigDecimal.valueOf(100)));
        System.out.println("ISS: " + calculadora.calcular(new ISS(), BigDecimal.valueOf(1000)));

        System.out.println("Strategy com Enum: ");
        System.out.println("ICMS: " + calculadora.calcular(ImpostoEnum.ICMS, BigDecimal.valueOf(100)));
        System.out.println("ISS: " + calculadora.calcular(ImpostoEnum.ISS, BigDecimal.valueOf(1000)));

        /*
        Quando estou trabalhando com o desenvolvimento de APIs, dou preferência ao uso de 'Enum',
        pois facilita para o cliente, já que só precisa enviar a String com o nome da Enum na requisição.
         */
    }
}
