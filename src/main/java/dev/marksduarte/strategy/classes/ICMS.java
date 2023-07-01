package dev.marksduarte.strategy.classes;

import dev.marksduarte.strategy.Imposto;

import java.math.BigDecimal;

public class ICMS implements Imposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.2));
    }
}
