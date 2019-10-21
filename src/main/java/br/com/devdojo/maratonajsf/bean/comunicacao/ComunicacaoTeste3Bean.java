package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable {
    private String nome;
    private String sobreNome;
    private String data;

    public void init(){

            System.out.println("Criou comunicacao 3");
            System.out.println(nome);
            System.out.println(sobreNome);
    }

    public String  save() {
        System.out.println("Salvando");


        System.out.println("Criou comunicacao 3");
        System.out.println(nome);
        System.out.println(sobreNome);
        return "resultado?faces-redirect=true&amp;includeViewParams=true";
    }

}
