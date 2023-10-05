package dev.marksduarte.chain_of_responsibility;

public class EloCadeiaComando extends CadeiaDeComandos {

    public EloCadeiaComando(CadeiaDeComandos proximo) {
        super(proximo);
    }

    protected Comando executarComando(String nome) {
        // executa o comando
        return new Comando();
    }
}