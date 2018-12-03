/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

/**
 *
 * @author kelvin
 */
public class Exercito {
    
    private int QTD;
    private String COR;
    
    
    public Exercito(int qtd, String cor) {
        this.QTD = qtd;
        this.COR = cor;
    }
    
    @Override
    public String toString() {
        return this.COR + "-" + this.QTD; 
    }

    public int getQTD() {
        return QTD;
    }

    public void setQTD(int QTD) {
        this.QTD = QTD;
    }

    public String getCOR() {
        return COR;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }
    
}
