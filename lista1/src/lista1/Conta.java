package lista1;

class Conta {
    String codigo;
    double saldo;
    Conta (String codigo, double saldo){
        this.codigo = codigo;
        this.saldo = saldo;
    }
    Conta (String codigo){
        this(codigo, 0);
    }

    boolean retira (double quantia){
        if(this.saldo >= quantia){
            this.saldo -= quantia;
            return true;
        }
        return false;
    }
    void deposita (double quantia){
        this.saldo += quantia;
    }
    boolean transfere (double quantia, String beneficiario){
        if(this.saldo <= quantia || beneficiario == null){
            return false;
        }
        this.saldo -= quantia;
        return true;
    }

}