package lista1;

class ListaInt {
    int[] lista;
    int tamanho;

    ListaInt(int capacidade){
        this.lista = new int[capacidade];
    }
    int obtemTamanho() {
        return this.tamanho;
    }
    boolean insereElemento(int valor) {
        if(this.lista.length > this.tamanho){
            this.lista[this.tamanho++] = valor;
            return true;
        }
        return false;
    }
    int obtemElemento(int i) {
        if (i >= 0 && i <= this.lista.length){
            return this.lista[i];
        }
        return -1;
    }

    public static void main(String []args){



    }

}