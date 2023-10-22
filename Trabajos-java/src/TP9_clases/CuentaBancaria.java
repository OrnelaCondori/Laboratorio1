package TP9_clases;

public class CuentaBancaria {
    private double saldo;
    private int nroCuenta;

    public CuentaBancaria(double saldo, int nroCuenta){
        this.saldo = saldo;
        this.nroCuenta =nroCuenta;
    }
    public void depositar(double deposito){
        if (deposito > 0) {
            saldo = saldo+deposito;
            System.out.println("Luego del deposito su saldo actual es: "+saldo);
        }else {
            System.out.println("El número ingresado no es valido");
        }
    }
    public void retirar(double retiro){
        if (retiro< saldo){
            saldo = saldo-retiro;
            System.out.println("Luego del retiro su salgo actial es: "+saldo);
        }else {
            System.out.println("El monto ingresado no es valido");
        }
    }
}
