package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable {
    @Inject @Param(name = "nome")
    private String nome;
    @Inject @Param(name = "sobreNome")
    private String sobreNome;

    @PostConstruct
    public void init(){
//        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
//        nome = paramsMap.get("nome");
//        sobreNome = paramsMap.get("sobrenome");
        System.out.println(nome);
        System.out.println(sobreNome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
