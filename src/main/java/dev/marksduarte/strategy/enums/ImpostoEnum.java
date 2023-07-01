package dev.marksduarte.strategy.enums;

import dev.marksduarte.strategy.Imposto;

import java.math.BigDecimal;

public enum ImpostoEnum implements Imposto {
    ICMS {
        @Override
        public BigDecimal calcular(BigDecimal valor) {
            return valor.multiply(BigDecimal.valueOf(0.2));
        }
    },
    ISS {
        @Override
        public BigDecimal calcular(BigDecimal valor) {
            return valor.multiply(BigDecimal.valueOf(0.5));
        }
    };
}
