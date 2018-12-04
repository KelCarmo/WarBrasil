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
public class Jogador {
    
    private String name;
    private String color;
    private int qtd_estados;
    private int qtd_carta_estado;
    
    public Jogador(String name, String color, int qtd_estados, int qtd_carta_estado) {
        this.name = name;
        this.color = color;
        this.qtd_estados = qtd_estados;
        this.qtd_carta_estado = qtd_carta_estado;
    }
    
    public void jogar() {
        
    }
    
    public void addQtdEstado(int qtd) {
        this.qtd_estados = this.qtd_estados + qtd;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getQtd_estados() {
        return qtd_estados;
    }
    
    public int getQtd_carta_estado() {
        return qtd_carta_estado;
    }
    /**
     * Método que serve para distribuir o exercíto  
     * @param j jogador que está na sua vez de jogar 
     * @param mapa o mapa do jogo , War I
     * @param estado o nome que o jogador vai distribuir o exercito dele 
     * @param qtd quantidade de exercíto que vai ser colocado no estado 
     * @return Será retornado falso caso o jogador tente colocar o exercítio 
     * que não é da mesma cor
     */
    public boolean distribuir_exercito(Jogador j, MapaClassico mapa, String estado, int qtd){
        
        if(j.getColor().equals(mapa.retorna_estado(estado).getName())){
            mapa.retorna_estado(estado).getExercito().setQTD(qtd);
            System.out.println("Jogada realizada com sucesso!");
            return true;
        }
        else{
            System.out.println("Você  passou um dos parametros errado, verifique e tente novamente!");
            return false;
        }
        
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.color + "| qtdEstado: " + this.qtd_estados + "\n";
    }
    
}
