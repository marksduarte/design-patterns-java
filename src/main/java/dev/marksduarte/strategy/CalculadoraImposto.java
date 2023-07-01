package dev.marksduarte.strategy;

import java.math.BigDecimal;

public class CalculadoraImposto {
    public BigDecimal calcular(Imposto imposto, BigDecimal valor) {
        return imposto.calcular(valor);
    }
}
