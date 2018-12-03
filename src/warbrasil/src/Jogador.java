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
    
}
