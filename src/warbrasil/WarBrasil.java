/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
import warbrasil.src.Jogador;
import warbrasil.src.MapaClassico;
import java.util.Scanner;

/**
 *
 * @author kelvin e Rejanio
 */
public class WarBrasil {
    
    public WarBrasil() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        boolean tem_vencedor = false;
        WarBrasil w = new WarBrasil();
        MapaClassico novo = MapaClassico.getInstance();
<<<<<<< HEAD
        novo.sortExercitos(2);        
        System.out.println(novo);
        System.out.println(novo.getPlayers());
        w.distruicao_de_exercito_inicial(novo.getPlayers());
        
        while(!tem_vencedor){
              for(int i = 0; i<novo.getPlayers().size(); i++){
                  
                  w.distribuir(novo.getPlayers().get(i));
                  while(true) {
                  System.out.println("\n Escolha o que deseja fazer : ");
                  System.out.println("1 - COMBATE ");
                  System.out.println("2 - PASSAR A VEZ");
                  int retorno = w.leitura_teclado_int();
                  if(retorno == 1 ){
                      System.out.println("----Inicio do COMBATE para o Jogador "+novo.getPlayers().get(i).getColor()+ " ----");
                      System.out.println("\n Digite o ataque: (exempplo-> AM-AP ) ");
                      String [] ataque = w.leitura_teclado_string().split("-");
                      novo.getPlayers().get(i).ataque(ataque[0], ataque[1]);
                  }
                  else if(retorno == 2){
                  //Passsou a vez 
                  break;
                  }
                  }                  
              if(novo.getPlayers().get(i).getQtd_estados()==24){
                  //forçando sair do for
                  i=novo.getPlayers().size()+1;
                  tem_vencedor=true;
                  //parabenizar o jogador!
                  w.parabenizar(novo.getPlayers().get(i));
                  
              }    
              }
              
              
        
        }
        
        
        
        
//        novo.getEstado("AC").getExercito().addExercito(10);
//        Scanner ler = new Scanner(System.in);
//        System.out.println(novo.getPlayers());
//        System.out.print("Atacar de: ");
//        String origem = ler.nextLine();
//        System.out.print("Para: ");
//        String destino = ler.nextLine();
//        novo.getPlayers().get(0).ataque(origem, destino);
//        
//        System.out.println(novo);
        
        
    }
    public void parabenizar(Jogador j){
        System.out.print("\n********************************************************************");
        System.out.println("\n * Parabéns jogador "+j.getColor()+ " você conquistou o Brasil!!!* ");
        System.out.print("\n********************************************************************");
        
        
    }
=======

        novo.sortExercitos(3);  

        System.out.println(novo);
        //condição para que ainda continue o jogo
        WarBrasil w = new WarBrasil();
        w.distruicao_de_exercito(novo.getPlayers(), novo);
        System.out.println(novo);

    }
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
    /**
     * Retorna a parte interia da divisao por 2
     * @param numero inteiro inserido
     * @return parte inteira da divisão por 2
     */
    public int divisao_por_dois(int numero){
<<<<<<< HEAD
        if((int) Math.floor(numero/2)==0){
            return 1;
        }
        return (int) Math.floor(numero/2);
    }
    
    private void distribuir(Jogador j) {
        int exercito = this.divisao_por_dois(j.getQtd_estados());
           System.out.println("------- Início da DISTRIBUUICAO para o " +j.getName()+ j.getColor() + " ------");
           while(exercito > 0){
           System.out.println(" Você tem " + exercito + " exercítos  para distribuir" );
               String estado = null;
               while(true) {
                //escolha do estado que deseja colocar o exercito
               System.out.println("\n--->Insira a sigla do estado que deseja colocar o exercito: \n");
               estado = this.leitura_teclado_string();
               System.out.printf("\n");
               if(MapaClassico.getInstance().getEstado(estado).getExercito().getCOR().equals(j.getColor())) {
                   break;
               } else {
                   System.out.println("Esse estado não te pertence !");
               }
               }
               
               while(true) {
               System.out.println("--->Insira a quantidade de exercito");
               int qtd = this.leitura_teclado_int();
               //caso o jogador coloque uma quantidade que ele não tem
               if(qtd > exercito) {
                   System.out.println("Voce inseriu uma quantidade maior do que tem \n");
               }
               else{
                   j.distribuir_exercito(j, MapaClassico.getInstance(), estado, qtd);
                   exercito = exercito-qtd;
                   break;
                   
               }
               }
               System.out.println(MapaClassico.getInstance());
               
           }
           System.out.println("------Fim da DISTRIBUICAO------\n");
    }
=======
        return (int) Math.floor(numero/2);
    }
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
    /**
     * Método responsável por fazer toda a pela distribuição de exercíto
     * @param jogadores a lista de jogadores participantes
     * @param m o mapa do jogo 
     */
<<<<<<< HEAD
   public void distruicao_de_exercito_inicial(ArrayList<Jogador> jogadores){
      MapaClassico mapa = MapaClassico.getInstance();
=======
   public void distruicao_de_exercito(ArrayList jogadores, MapaClassico m){
      
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
       
       for(int i = 0; i<jogadores.size(); i++){
           Jogador temp = (Jogador)jogadores.get(i);
           //quantidade de exercito que o jogador pode distriuir
           int exercito = this.divisao_por_dois(temp.getQtd_estados());
<<<<<<< HEAD
           System.out.println("------Início da DISTRIBUICAO INICIAL para o " +temp.getName()+ temp.getColor() + "------");
           while(exercito > 0){
           System.out.println("Você tem " + exercito + " para distribuir" + "------");
               String estado = null;
               while(true) {
                //escolha do estado que deseja colocar o exercito
               System.out.println("Insira a sigla do estado que deseja colocar o exercito");
               estado = this.leitura_teclado_string();
               System.out.printf("\n");
               if(mapa.getEstado(estado).getExercito().getCOR().equals(temp.getColor())) {
                   break;
               } else {
                   System.out.println("Esse estado não te pertence !");
               }
               }
               
               while(true) {
               System.out.println("Insira a quantidade de exercito");
               int qtd = this.leitura_teclado_int();
               //caso o jogador coloque uma quantidade que ele não tem
               if(qtd > exercito) {
                   System.out.println("Voce inseriu uma quantidade maior do que tem \n");
               }
               else{
                   temp.distribuir_exercito(temp, MapaClassico.getInstance(), estado, qtd);
                   exercito = exercito-qtd;
                   System.out.println("Voce ainda tem agora: " +exercito+ " para distribuir");
                   break;
                   
               }
               }
               
           }
           System.out.println("------FIM DA JOGADA------\n");
           System.out.println(MapaClassico.getInstance());
=======
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
           
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
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
<<<<<<< HEAD
    
=======
>>>>>>> 7758a7d816c2cd2e369ce291945e05ad125097d7
}
