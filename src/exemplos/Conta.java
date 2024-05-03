package exemplos;

public class Conta {
    int numero;
    String nomeTitular;
    double saldo;
    
    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            // subtrai o valor do saldo
            // this.saldo = this.saldo - valor
            this.saldo -= valor;
            return true;
        } else 
            return false;        
    }
}
