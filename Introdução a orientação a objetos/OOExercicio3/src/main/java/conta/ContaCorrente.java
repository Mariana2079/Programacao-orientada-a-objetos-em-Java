package conta;

import java.text.DecimalFormat;

public class ContaCorrente {
    
    private long numero;
    private double saldo;
    
    public ContaCorrente() {
        saldo = 0;
    }
    
    public ContaCorrente(long n, double s) {
        numero = n;
        setSaldo(s);
    }
    
    public long getNumero() {
        return numero;
    }
    
    public void setNumero(long n) {
        numero = n;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double s) {
        if (s >= 0) {
            saldo = s;
        } else {
            saldo = 0;
        }
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else if (valor > 0) {
            saldo -= valor;
        }            
        return true;
    }
    
    public String toString() {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        String saldoFormatado = formatador.format(saldo);
        return "Saldo da conta " + numero + ": " + saldoFormatado;
    }
    
}
