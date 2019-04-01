package br.ufba.mata55.lista2.exercicio3;

public class Veiculo {

    private String placa;
    private int renavam;
    private Pessoa condutor;

    public Veiculo(String placa, int renavam, Pessoa condutor){

        this.placa = placa;
        this.renavam = renavam;
        this.condutor = condutor;

    }

    public Veiculo(String placa, int renavam){

        this.placa = placa;
        this.renavam = renavam;

    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCondutor(Pessoa condutor) {
        this.condutor = condutor;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public Pessoa getCondutor() {
        return condutor;
    }

    public int getRenavam() {
        return renavam;
    }
}
