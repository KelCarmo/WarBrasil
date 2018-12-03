/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

import java.util.ArrayList;

/**
 *
 * @author kelvin
 */
public abstract class Mapa {
    protected ArrayList<Estado> estados ;
    protected final String nome_regiao [] = new String[5];
    protected final String cores [] = new String[6];
    protected final int qtdEstados;
    
    public Mapa() {
        this.nome_regiao[0]= "NORTE";
        this.nome_regiao[1]= "NORDESTE";
        this.nome_regiao[2]= "CENTRO-OESTE";
        this.nome_regiao[3]= "SUDESTE";
        this.nome_regiao[4]= "SUL";
        this.cores[0] = "VERMELHO";
        this.cores[1] = "AZUL";
        this.cores[2] = "VERDE";
        this.cores[3] = "BRANCO";
        this.cores[4] = "AMARELO";
        this.cores[5] = "PRETO";
        this.qtdEstados = 24;
        this.estados = new ArrayList<>();
    }
    
    abstract void montarMapa();
    
    abstract public void sortExercitos(int qtdPlayers);
    
}
