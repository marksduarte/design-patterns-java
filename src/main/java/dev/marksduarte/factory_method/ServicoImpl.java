package dev.marksduarte.factory_method;

import java.util.List;

public class ServicoImpl extends ServicoAbstrato<Pessoa> {

    private DAO<Pessoa> dao;

    ServicoImpl(GeradorArquivo gerador) {
        super(gerador);
    }

    // A instância de PessoaDAO é criada na primeira chamada ao método.
    @Override
    public DAO<Pessoa> getDAO() {
        if (this.dao == null)
            this.dao = new PessoaDAO();
        return this.dao;
    }

    // Implementação específica.
    public String getPessoaNome(Object id) {
        var p = getDAO().recuperarPorId(id);
        return p.getNome();
    }
}

// Implementações com a lógica especifica para a pessoa.
class PessoaDAO implements DAO<Pessoa> {

    @Override
    public Pessoa recuperarPorId(Object id) {
        return null;
    }

    @Override
    public void salvar(Pessoa entidade) {
        // salva
    }

    @Override
    public void excluir(Object id) {
        // excluir
    }

    @Override
    public List<Pessoa> listarTodos() {
        return null;
    }
}
