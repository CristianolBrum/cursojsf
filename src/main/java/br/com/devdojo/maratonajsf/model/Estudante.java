package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enums.Turno;

import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;

public class Estudante {
    private String nome = "Cristiano";
    private String sobreNome = "Brum";
    private double nota1 = 5;
    private double nota2 = 8;
    private double nota3 = 10;
    private Turno turno = Turno.MATUTINO;

    public Estudante() {
    }

    public Estudante(String nome, String sobreNome, double nota1) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nota1 = nota1;
    }

    public static List<Estudante> estudanteList(){
        return asList(new Estudante("Ikki", "Fenix", 10),
        new Estudante("Shiryu", "Dragao",10),
        new Estudante("Seya", "Pegasus", 10));
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
