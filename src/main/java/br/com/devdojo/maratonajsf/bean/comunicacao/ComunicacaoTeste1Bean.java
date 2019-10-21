package br.com.devdojo.maratonajsf.bean.comunicacao;

<<<<<<< HEAD
import javax.annotation.PostConstruct;
=======
>>>>>>> origin/master
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.Date;
=======
>>>>>>> origin/master

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {

    private String nome;
    private String sobreNome;
<<<<<<< HEAD
    private Date data = new Date();
=======
>>>>>>> origin/master

    public void imprimirAtributos(){
        String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(initParameter);
    }

<<<<<<< HEAD

=======
>>>>>>> origin/master
    public String save(){
        return "comunicacao2?faces-redirect=true&nome="+nome+"&sobrenome="+sobreNome;
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
<<<<<<< HEAD

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

=======
>>>>>>> origin/master
}
