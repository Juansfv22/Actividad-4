/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacuenta;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    public Cuenta(float saldo, float tasaAnual) { 
        this.saldo = saldo; 
        this.tasaAnual = tasaAnual; 
    }
    public void consignar(float cantidad) { 
        saldo += cantidad;
        numeroConsignaciones += 1;
    } 
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad; 
            numeroRetiros += 1; }
        else { 
            System.out.println("Saldo insuficiente"); 
        } 
    }
    public void calcularInterés() { 
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    } 
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInterés();
    }
    public void imprimir() {
        System.out.println("Saldo = $ "+ saldo);
        System.out.println("Número de consignaciones = $ "+numeroConsignaciones);
        System.out.println("Número de retiros = $ "+numeroRetiros);
        System.out.println("Tasa anual = $ "+tasaAnual);
        System.out.println("Comisión mensual = $ "+comisionMensual);
    }
}
