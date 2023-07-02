package dev.marksduarte.factory_method;

public abstract class ServicoAbstrato<E> {
    public GeradorArquivo gerador;

    // Simula uma injeção de dependência.
    ServicoAbstrato(GeradorArquivo gerador) {
        this.gerador = gerador;
    }

    // O padrão Factory Method usa um hook method para delegar a criação da instância
    // para a subclasse.
    public abstract DAO<E> getDAO();

    public void salvarEmArquivo(Object id, String nomeArquivo) {
        E entidade = getDAO().recuperarPorId(id);
        this.gerador.gerarArquivo(nomeArquivo, entidade);
    }
}
