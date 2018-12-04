/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil;

import java.util.ArrayList;
import warbrasil.src.Jogador;
import warbrasil.src.MapaClassico;
import java.util.Scanner;

/**
 *
 * @author kelvin e Rejanio
 */
public class WarBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MapaClassico novo = MapaClassico.getInstance();

        novo.sortExercitos(3);  

        System.out.println(novo);
        //condição para que ainda continue o jogo
        WarBrasil w = new WarBrasil();
        w.distruicao_de_exercito(novo.getPlayers(), novo);
        System.out.println(novo);

    }
    /**
     * Retorna a parte interia da divisao por 2
     * @param numero inteiro inserido
     * @return parte inteira da divisão por 2
     */
    public int divisao_por_dois(int numero){
        return (int) Math.floor(numero/2);
    }
    /**
     * Método responsável por fazer toda a pela distribuição de exercíto
     * @param jogadores a lista de jogadores participantes
     * @param m o mapa do jogo 
     */
   public void distruicao_de_exercito(ArrayList jogadores, MapaClassico m){
      
       
       for(int i = 0; i<jogadores.size(); i++){
           Jogador temp = (Jogador)jogadores.get(i);
           //quantidade de exercito que o jogador pode distriuir
           int exercito = this.divisao_por_dois(temp.getQtd_estados());
           System.out.println("------Início da DISTRUICAO para o jogador ------");
           while(exercito > 0){
               //escolha do estado que deseja colocar o exercito
               System.out.println("Insira a sigla do estado que deseja colocar o exercito");
               String estado = this.leitura_teclado_string();
               System.out.printf("\n");
               System.out.println("Insira a quantidade de exercito");
               int qtd = this.leitura_teclado_int();
               //caso o jogador coloque uma quantidade que ele não tem
               if(this.entrada_valida_qtd_exercito(qtd, exercito)==false){
                   System.out.println("Voce inseriu uma quantidade maior do que tem \n");
               }
               else{
                   temp.distribuir_exercito(temp, m, estado, qtd);
                   exercito= exercito-qtd;
                   System.out.println("Voce ainda tem agora: " +exercito+ " para distribuir");
                   
               }
               
           }
           System.out.println("------FIM DA JOGADA------");
           
       }
   }
   
   /**
    * Verifica se a quantidade de exercito que o jogador digitou é maior do que ele possui
    * @param qtd quantidade digitada pelo jogador
    * @param exercito quantidade atual do exercito do jogador;
    * @return retorna falso se a quantidade digitada for maior do que ele possui
    */
   public boolean entrada_valida_qtd_exercito(int qtd,int exercito){
       if(qtd>exercito){
           return false;
       }
       return true;
   }
   
   /**
    *Método responsável por ler os comandos digitado pelo usuário
    * @return retorna a string que o usuário digitou
    */
   public String leitura_teclado_string(){
       String temp = null;
       Scanner scanner = new Scanner(System.in);
       temp = scanner.nextLine();
       return temp; 
   }
   /**
    * Método responsável por ler os comandos digitado pelo usuário
    * @return retorna o inteiro que o usuário digitou
    */
   public int leitura_teclado_int(){
       int temp;
       Scanner scanner = new Scanner(System.in);
       return temp = scanner.nextInt();
   }
}
