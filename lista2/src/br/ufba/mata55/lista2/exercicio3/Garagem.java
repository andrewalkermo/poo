package br.ufba.mata55.lista2.exercicio3;

public class Garagem {

    private int tamanho = 0;
    private Veiculo[] veiculos = new Veiculo[40];

    public void inserirVeiculo(Veiculo veiculo){
        if(this.tamanho < this.veiculos.length){
            this.veiculos[tamanho++] = veiculo;
        }
    }

    public Veiculo buscar (String placa){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.veiculos[i].getPlaca().equals(placa)){
                return this.veiculos[i];
            }
        }
        return null;
    }

    public Veiculo buscar (int renavam){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.veiculos[i].getRenavam() == renavam){
                return this.veiculos[i];
            }
        }
        return null;
    }

    public Veiculo buscar (Pessoa condutor){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.veiculos[i].getCondutor().getRg() == condutor.getRg()){
                return this.veiculos[i];
            }
        }
        return null;
    }

}
