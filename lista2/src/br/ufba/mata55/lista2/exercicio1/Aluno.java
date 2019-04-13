package br.ufba.mata55.lista2.exercicio1;

public class Aluno {

    public final String nome;
    private Double nota;

    public Aluno (String nome, Double nota){
        this.nome = nome;
        if(nota >= 0.0 && nota <= 10.0){
            this.nota = nota;
        }
    }

    public Aluno (String nome){
        this.nome = nome;
    }

    public void setNota(Double nota) {
        if(nota >= 0.0 && nota <= 10.0){
            this.nota = nota;
        }    }

    public Double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}
