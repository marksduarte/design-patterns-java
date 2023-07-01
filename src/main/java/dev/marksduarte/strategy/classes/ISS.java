package dev.marksduarte.strategy.classes;

import dev.marksduarte.strategy.Imposto;

import java.math.BigDecimal;

public class ISS implements Imposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.5));
    }
}
