package dev.marksduarte.chain_of_responsibility;

/**
 * Exemplo de implementação de uma cadeia de responsabilidade, 
 * onde cada elo da corrente executa a sua lógica e chama o próximo caso seja necessário.
 */
public abstract class CadeiaDeComandos {
    private CadeiaDeComandos proximo;

    public CadeiaDeComandos(CadeiaDeComandos proximo) {
        this.proximo = proximo;
    }

    public Comando executar(String nome) {
        Comando c = executarComando(nome);
        if (c == null)
            return chamarProximo(nome);
        return c;
    }

    protected Comando chamarProximo(String nome) {
        if (proximo == null)
            throw new RuntimeException("Não foi possível executar o comando!");
        return proximo.executar(nome);
    }

    protected abstract Comando executarComando(String nome);
}