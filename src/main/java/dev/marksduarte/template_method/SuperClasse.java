package dev.marksduarte.template_method;

/**
 * O padrão Template Method, utiliza a técnica dos hook methods, que também
 * são utilizados por outros padrões.
 */
public abstract class SuperClasse {

    // hook method
    public abstract void antesDeSalvar(Object o);

    // Método principal que delega parte da lógica para as classes filhas,
    // que implementam os métodos obrigatórios ou não.
    public final Object salvar(Object o) {
        this.antesDeSalvar(o);
        // persist in database
        this.aposSalvar(o);
        return o;
    }

    // hook method
    public void aposSalvar(Object o) {}
}
