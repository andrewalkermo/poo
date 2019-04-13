package br.ufba.mata55.lista2.exercicio4;

public class Item {

    private String codigo;
    private String nome;
    private double preco;

    public Item(String codigo,String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;

        if(preco >= 0){
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setCodigo(String codigo) {
        if (codigo != null){
            this.codigo = codigo;
        }
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        }
    }

}
