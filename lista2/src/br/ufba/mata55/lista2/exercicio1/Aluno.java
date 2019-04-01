package br.ufba.mata55.lista2.exercicio1;

public class Aluno {

    public String nome;
    private Double nota;

    public Aluno (String nome, Double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno (String nome){
        this.nome = nome;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

}
