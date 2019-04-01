package br.ufba.mata55.lista2.exercicio4;

public class Main {

    public static void main(String[] args){
        Item i1 = new Item("1","feijão", 6.30);
        Item i2 = new Item("2","arroz", 3.70);

        Pedido p1 = new Pedido("31/03/2019", 12, 1, 2,i1);
        Pedido p2 = new Pedido("01/02/2019", 42, 1, 4,i2);

        System.out.println(p1.getPrecoTotal(0.05));
        System.out.println(p2.getPrecoTotal());

    }

}
