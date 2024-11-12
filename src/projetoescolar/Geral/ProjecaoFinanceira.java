/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescolar.Geral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ProjecaoFinanceira {
    
    
    
private double valorTotal;
private String aporte;
private String data;

   public ProjecaoFinanceira() {
        
    }

    public ProjecaoFinanceira(double valorTotal, String aporte, String data) {
        this.valorTotal = valorTotal;
        this.aporte = aporte;
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getAporte() {
        return aporte;
    }

    public void setAporte(String aporte) {
        this.aporte = aporte;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

 @Override
    public String toString() {
        return "TIPO DA GRANA = " + aporte + "....." +
               "VALOR = " + valorTotal +
               "........ MES:" + data 
               ;
    }
    
    
    
}
