package dev.marksduarte.template_method;

public class SubClasse extends SuperClasse {
    @Override
    public void antesDeSalvar(Object o) {
        // lógica a ser realizada antes de persistir o objeto.
    }

    @Override
    public void aposSalvar(Object o) {
        // lógica após persistir o objeto.
    }
}
