package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.inject.Scope;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Eu","sou","burro"};
    private List<String> nomesList = asList("Jaum","Djedje","Sirvo", "Dalvino");
    private Set<String> nomeSet = new HashSet<>(asList("Goku","Vegeta","Saitama", "Dalvino"));
    private Map<String,String> nomeMap = new HashMap<>();
    private boolean mostrarNotas ;


    public void exibirNotas(){
        this.mostrarNotas = true;
    }
    public void esconderNotas(){
        this.mostrarNotas = false;
    }
    {
        nomeMap.put("Saitama","O mais forte");
        nomeMap.put("Vegeta", "O mais BadAss");
        nomeMap.put("Naruto", "O mais Chato");
        //Para imprimir o Map
//        for(Map.Entry<String,String> entry : nomeMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }

    public void executar(){
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String param){
        System.out.println("Inscrivinhanu o textu: "+param);
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Map<String, String> getNomeMap() {
        return nomeMap;
    }

    public void setNomeMap(Map<String, String> nomeMap) {
        this.nomeMap = nomeMap;
    }

    public Set<String> getNomeSet() {
        return nomeSet;
    }

    public void setNomeSet(Set<String> nomeSet) {
        this.nomeSet = nomeSet;
    }

    public List<String> getNomesList() {

        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
