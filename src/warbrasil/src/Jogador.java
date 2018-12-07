/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author kelvin
 */
public class Jogador implements Comparable<Jogador> {
    
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
    /**
     * Retorna quantos estados o Jogador tem no mapa
     * @return Quantidade de estados
     */
    public int getQtd_estados() {
        return this.qtd_estados;
    }
    
    public void addQtdEstado(int qtd) {
        this.qtd_estados = this.qtd_estados + qtd;
    }
    
    public void subQtdEstado(int qtd) {
        this.qtd_estados = this.qtd_estados - qtd;
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
    
    public void ataque(String estadoOrigem, String estadoDestino) {
        Estado origem = MapaClassico.getInstance().getEstado(estadoOrigem);
        Estado destino = origem.getVizinho(estadoDestino);
        String corDestino = destino.getExercito().getCOR();
        int qtdO = origem.getExercito().getQTD();
        int qtdD = destino.getExercito().getQTD();
        int result = 0;
        int ataque = 1;
        if(qtdO > 1) {
            
        if(qtdO > 3 ) {
            if(qtdD >=3) { result = this.combate(3, qtdD);
            ataque = 3;
            }
            else {
                result = this.combate(3, qtdD);
                ataque = 3;
            }
        }else {
            result = this.combate(qtdO-1, qtdD);
            ataque = qtdO-1;
        }
         //Atualizando informações no MAPA
         destino.getExercito().subQTD(result);
         origem.getExercito().subQTD(qtdD - result);
        
         if(qtdD == result) {
             // O Atacante conquistou o território
             System.out.println("--->Você conquistou o(a) " + destino.getName());
             String cor_do_jogador_perdedor = destino.getExercito().getCOR();
             int qtdEstadoO = origem.getExercito().getQTD();
             int remanejar = 1;
             if(qtdEstadoO > 3) remanejar = 3;
             else if(qtdEstadoO <= 3) remanejar = qtdEstadoO -1;
             System.out.println(MapaClassico.getInstance());
             System.out.println("\n Você pode remanejar até " + remanejar + " exércitos. Digite quantos quer remanejar");
             Scanner ler = new Scanner(System.in);
             int qtdExec = ler.nextInt();
             origem.getExercito().subQTD(qtdExec);
             destino.getExercito().addExercito(qtdExec);
             destino.getExercito().setCOR(origem.getExercito().getCOR());//Atualiza a cor do Estado que perdeu a guerra, para a cor do Estado que a conquistou
             this.addQtdEstado(1);
             MapaClassico.getInstance().getJogador(corDestino).subQtdEstado(1);
             
             //caso o jogador perdedor tenha mais nenhum exercito ele é eliminado do jogo
             
            MapaClassico.getInstance().verificar_jogador(cor_do_jogador_perdedor);
             
         }
        
        }else {
            // Não pode atacar só com 1 exército
             System.out.println("\n !!!-->Você só tem 1 exército, NÃO PODE ATACAR<--!!!");
        }
        
       System.out.println(MapaClassico.getInstance());
        
    }
    
    
    /**
     * Método que simula os dados no ataque
     * @param origem
     * @param destino
     * @return Quantos exércitos o Atacante conseguiu eliminar do defensor
     */
    private int combate (int origem, int destino) {
        Random ram = new Random();
        int wins = 0;
        int vetorO[] = new int[3];
        int vetorD[] = new int[3];
        
        for (int i=0; i < 3; i++) {
            if(i < origem) vetorO[i] = ram.nextInt(6) + 1;
            else vetorO[i] = 0;
        }
        
        for (int i=0; i < 3; i++) {
            if(i < destino) vetorD[i] = ram.nextInt(6) + 1;
            else vetorD[i] = 0;
        }
        
        Arrays.sort(vetorO);
        Arrays.sort(vetorD);
        
        System.out.print("Dados do Ataque: ");
        for (int i = 0; i < vetorO.length; i++) {
                        if(vetorO[i]==0){
                System.out.print("-"+ " ");
            }
            else{
                System.out.print(vetorO[i] + " ");
            }
        }
        System.out.println("\n");
        System.out.print("Dados da Defesa: ");        
         for (int i = 0; i < vetorD.length; i++) {
            if(vetorD[i]==0){
                System.out.print("-"+ " ");
            }
            else{
                System.out.print(vetorD[i] + " ");
            }
             
        }
        System.out.println("\n");
         
        for (int i = 2; i >= 0; i--) {
            if(vetorO[i] == 0 || vetorD[i] == 0) ;
            else {
                if(vetorO[i] > vetorD[i]) wins++;
            }
        }
        return wins;
    }
    
//        public void distribuir() {
//            int dist = this.qtd_estados / 2;
//            System.out.println("Você pode distribuir " + dist + " exércitos");
//            System.out.println("Digite o Estado e a Quantidade EX: AA- " + dist + " exércitos");
//        }
//        
        /**
     * Método que serve para distribuir o exercíto
     *
     * @param j jogador que está na sua vez de jogar
     * @param mapa o mapa do jogo , War I
     * @param estado o nome que o jogador vai distribuir o exercito dele
     * @param qtd quantidade de exercíto que vai ser colocado no estado
     * @return Será retornado falso caso o jogador tente colocar o exercítio que
     * não é da mesma cor
     */
    public void distribuir_exercito(Jogador j, MapaClassico mapa, String estado, int qtd) {
            Estado temp = mapa.retorna_estado(estado);
            temp.getExercito().addExercito(qtd);
    }

    @Override
    public int compareTo(Jogador j) {
      if(j.getColor().equals(this.color)){
          return 0;
      }
      return 1;
    }
    
    
}
