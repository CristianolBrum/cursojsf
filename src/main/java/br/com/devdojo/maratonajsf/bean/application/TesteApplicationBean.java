package br.com.devdojo.maratonajsf.bean.application;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;
    private final TesteDependentBean dependentBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean) {
        this.dependentBean = dependentBean;
    }

    @PostConstruct
    public void init(){
        System.out.println("Entoru no postConstuct do applicationscoped");
        categoriaList = asList("vida","morte","meia_fase");
        dependentBean.getCategoriasList().addAll(asList("Comedia", "Terror", "Suspense"));
    }

    public void mudarLista(){
        categoriaList = asList("RPG", "Aventura", "Ação");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }
}
