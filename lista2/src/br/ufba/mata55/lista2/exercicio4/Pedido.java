package br.ufba.mata55.lista2.exercicio4;

import java.beans.PropertyEditor;

public class Pedido {

    private String data;
    private int codigo;
    private int status;
    private int quantidade;
    private Item item;

    public Pedido (String data, int codigo, int status, int quantidade, Item item){

        this.data = data;
        this.codigo = codigo;
        this.status = status;
        this.quantidade = quantidade;
        this.item = item;

    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setStatus(int status) {
        if(status == 1 || status == 2 || status == 3){
            this.status = status;
        }
        else {
            throw new IllegalArgumentException("Valor inválido para status");
        }
    }

    public double getPrecoTotal() {
        return (this.item.getPreco() * this.quantidade);
    }

    public double getPrecoTotal(double desconto) {
        if(desconto >= 0.05 && desconto <= 0.80){
            return ((this.item.getPreco() * this.quantidade) - (this.item.getPreco() * this.quantidade * desconto));
        }
        return (this.item.getPreco() * this.quantidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getStatus() {
        switch (this.status){
            case 1:
                return "solicitado";
            case 2:
                return "enviado";
            case 3:
                return "concluído";
            default:
                return null;
        }
    }

    public Item getItem() {
        return item;
    }

    public String getData() {
        return data;
    }



}