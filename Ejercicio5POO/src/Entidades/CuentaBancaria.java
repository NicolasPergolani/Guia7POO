/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public class CuentaBancaria {
    private int nroCuenta;
    private long dni;
    private int saldoActual;
        
    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, long dni, int saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nroCuenta=" + nroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
}
