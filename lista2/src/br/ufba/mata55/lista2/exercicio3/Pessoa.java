package br.ufba.mata55.lista2.exercicio3;

public class Pessoa {

    private int rg;
    private String nome;

    public Pessoa (int rg, String nome){
        this.rg = rg;
        this.nome = nome;
    }

    public Pessoa (int rg){
        this.rg = rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

}
