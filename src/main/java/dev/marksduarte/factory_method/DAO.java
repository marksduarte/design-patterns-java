package dev.marksduarte.factory_method;

import java.util.List;

public interface DAO<E> {
    E recuperarPorId(Object id);
    void salvar(E entidade);
    void excluir(Object id);
    List<E> listarTodos();
}
