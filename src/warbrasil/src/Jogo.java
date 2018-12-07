/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

/**
 *
 * @author kelvin e Rejanio
 */
public class Jogo {
<<<<<<< HEAD
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
            mapa.retorna_estado(estado).getExercito().addExercito(qtd);
            return true;
        }
        
        return false;
    }
=======
    
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
    
    
}
