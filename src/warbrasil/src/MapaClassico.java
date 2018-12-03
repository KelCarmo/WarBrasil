/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author kelvin
 */
public class MapaClassico extends Mapa {
    
    private ArrayList<Jogador> players = new ArrayList<>();
    private static MapaClassico uniqueInstance;
    
    private MapaClassico() {
        super();
        this.montarMapa();
    }
    
    public static synchronized MapaClassico getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new MapaClassico();
 
        return uniqueInstance;
    }

    @Override
    void montarMapa() {
        
        // Região SUL
        Estado SC = new Estado("SC", this.nome_regiao[4]);
        Estado PR = new Estado("PR", this.nome_regiao[4]);
        Estado RS = new Estado("RS", this.nome_regiao[4]);
        
        // Região SUDESTE
        Estado SP = new Estado("SP", this.nome_regiao[3]);
        Estado MG = new Estado("MG", this.nome_regiao[3]);
        Estado ES = new Estado("ES", this.nome_regiao[3]);
        Estado RJ = new Estado("RJ", this.nome_regiao[3]);
        
        // Região CENTRO-OESTE
        Estado MT = new Estado("MT", this.nome_regiao[2]);
        Estado GO = new Estado("GO", this.nome_regiao[2]);
        
        // Região NORDESTE
        Estado BA = new Estado("BA", this.nome_regiao[1]);
        Estado PI = new Estado("PI", this.nome_regiao[1]);
        Estado MA = new Estado("MA", this.nome_regiao[1]);
        Estado CE = new Estado("CE", this.nome_regiao[1]);
        Estado RN = new Estado("RN", this.nome_regiao[1]);
        
        Estado PB = new Estado("PB", this.nome_regiao[1]);
        Estado PE = new Estado("PE", this.nome_regiao[1]);
        Estado AL = new Estado("AL", this.nome_regiao[1]);
        Estado SE = new Estado("SE", this.nome_regiao[1]);
        
        // Região NORTE
        Estado AC = new Estado("AC", this.nome_regiao[0]);
        Estado AM = new Estado("AM", this.nome_regiao[0]);
        Estado PA = new Estado("PA", this.nome_regiao[0]);
        Estado AP = new Estado("AP", this.nome_regiao[0]);
        Estado RO = new Estado("RO", this.nome_regiao[0]);
        Estado RR = new Estado("RR", this.nome_regiao[0]);
        
        // Vizinhos
        
        // ACRE
        AC.addVizinho(AM);
        AC.addVizinho(RO);        
        this.estados.add(AC);
        
        // AMAZONAS
        AM.addVizinho(AC);
        AM.addVizinho(RR);        
        AM.addVizinho(PA);        
        AM.addVizinho(RO);        
        AM.addVizinho(MT);        
        this.estados.add(AM);
        
        // PARÁ
        PA.addVizinho(AP);
        PA.addVizinho(RR);
        PA.addVizinho(AM);
        PA.addVizinho(MT);
        PA.addVizinho(GO);
        PA.addVizinho(MA);
        this.estados.add(PA);
        
        // AMAPÁ
        AP.addVizinho(PA);
        this.estados.add(AP);
        
        // RONDONIA
        RO.addVizinho(MT);
        RO.addVizinho(AM);
        RO.addVizinho(AC);
        this.estados.add(RO);
        
        // RORAIMA
        RR.addVizinho(AP);
        RR.addVizinho(PA);
        this.estados.add(RR);
        
        // BAHIA
        BA.addVizinho(SE);
        BA.addVizinho(AL);
        BA.addVizinho(PE);
        BA.addVizinho(PI);
        BA.addVizinho(GO);
        BA.addVizinho(MG);
        BA.addVizinho(ES);
        this.estados.add(BA);
        
        // PIAUÍ
        PI.addVizinho(CE);
        PI.addVizinho(PE);
        PI.addVizinho(BA);
        PI.addVizinho(MA);
        this.estados.add(PI);
        
        // MARANHÃO
        MA.addVizinho(PA);
        MA.addVizinho(GO);
        MA.addVizinho(PI);
        this.estados.add(MA);
        
        // CEARÁ
        CE.addVizinho(PI);
        CE.addVizinho(PE);
        CE.addVizinho(PB);
        CE.addVizinho(RN);
        this.estados.add(CE);
        
        // RIO GRANDE DO NORTE
        RN.addVizinho(CE);
        RN.addVizinho(PB);
        this.estados.add(RN);
        
        // PARAIBA
        PB.addVizinho(RN);
        PB.addVizinho(PE);
        PB.addVizinho(CE);
        this.estados.add(PB);
        
        // PERNAMBUCO
        PE.addVizinho(AL);
        PE.addVizinho(PB);
        PE.addVizinho(CE);
        PE.addVizinho(BA);
        PE.addVizinho(PI);
        this.estados.add(PE);                
        
        // ALAGOAS
        AL.addVizinho(SE);
        AL.addVizinho(PE);
        AL.addVizinho(BA);
        this.estados.add(AL);
        
        // SERGIPE
        SE.addVizinho(AL);
        SE.addVizinho(BA);
        this.estados.add(SE);
        
         // SANTA CATARINA
        SC.addVizinho(PR);
        SC.addVizinho(RS);
        this.estados.add(SC);
        
        // PARANÁ
        PR.addVizinho(SC);
        PR.addVizinho(SP);
        PR.addVizinho(MT);
        this.estados.add(PR);
        
        // RIO GRANDE DO SUL
        RS.addVizinho(SC);
        this.estados.add(RS);
        
        // SAO PAULO
        SP.addVizinho(RJ);
        SP.addVizinho(MG);
        SP.addVizinho(MT);
        SP.addVizinho(PR);
        this.estados.add(SP);
        
        // MINAS GERAIS
        MG.addVizinho(ES);
        MG.addVizinho(RJ);
        MG.addVizinho(SP);
        MG.addVizinho(MT);
        MG.addVizinho(GO);
        MG.addVizinho(BA);
        this.estados.add(MG);
        
        // ESPIRITO SANTO
        ES.addVizinho(BA);
        ES.addVizinho(RJ);
        ES.addVizinho(MG);
        this.estados.add(ES);
        
        // RIO DE JANEIRO
        RJ.addVizinho(SP);
        RJ.addVizinho(MG);
        RJ.addVizinho(ES);
        this.estados.add(RJ);
        
        // MATO GROSSO
        MT.addVizinho(RO);
        MT.addVizinho(PA);
        MT.addVizinho(GO);
        MT.addVizinho(MG);
        MT.addVizinho(SP);
        MT.addVizinho(PR);
        this.estados.add(MT);
        
        // GOIAS
        GO.addVizinho(PA);
        GO.addVizinho(MT);
        GO.addVizinho(MG);
        GO.addVizinho(BA);
        GO.addVizinho(MA);
        this.estados.add(GO);
    }
    
    public Estado retorna_estado(String nome){
        for(int i =0; i<this.estados.size();i++){
            if(this.estados.get(i).getName().equals(nome)){
                return this.estados.get(i);
            
            }
        }
        return null;
    }
    private TreeSet<Integer> sortNumCores(int qtdPlayers) {
        TreeSet<Integer> numeros = new TreeSet<>();
        Random rand = new Random();
        //Vamos sortear 20 números de 0 até 100 sem repetição
        while (numeros.size() < qtdPlayers) {
            int j = rand.nextInt(this.cores.length);
           numeros.add(j);
        }
        return numeros;
    }
    
    private TreeSet<Integer> sortNum(int qtdNums) {
        TreeSet<Integer> numeros = new TreeSet<>();
        Random rand = new Random();
        //Vamos sortear 20 números de 0 até 100 sem repetição
        while (numeros.size() < qtdNums) {
            int j = rand.nextInt(qtdNums);
           numeros.add(j);
        }
        return numeros;
    }
    
  
    @Override
    public void sortExercitos(int qtdPlayers) {
        
        // Escolhe aleatóriamente as cores para a quantidade de jogadores escolhida
        ArrayList<Exercito> exercitos = new ArrayList<>();
        TreeSet<Integer> numeros = sortNumCores(qtdPlayers);
        for(int i = 0; i<qtdPlayers; i++) {
            Exercito n = new Exercito(1,this.cores[numeros.pollFirst()]);
            exercitos.add(n);
        }
        System.out.println(exercitos);
        for(Exercito temp: exercitos) {
            Jogador n = new Jogador("Jogador ", temp.getCOR(), this.estados.size()/qtdPlayers,1);
            this.players.add(n);
        }
        
            if (qtdPlayers > 6 || qtdPlayers == 1){
            //Execeção
        }else {
            
            // distribui os Países de Forma aleatória de acordo com a quantidade de jogadores escolhida.
            TreeSet<Integer> nums = sortNum(this.estados.size());
            int x = this.estados.size()/qtdPlayers;
            int y =this.estados.size()%qtdPlayers;
            System.err.println(y);
            for (int j = 0; j< x+y; j++) {
                TreeSet<Integer> players = sortNum(qtdPlayers);
                for(int i = 0; i<qtdPlayers; i++) {
                    if(!nums.isEmpty()) this.estados.get(nums.pollFirst()).setExercito(exercitos.get(players.pollFirst()));
                }
            }
        
            
        }
        
        
        
    }
    
    @Override
    public String toString() {
        String temp = "";
        for (String regiao : this.nome_regiao) {
            temp = temp + regiao + " - ";
            for(Estado estado: this.estados) {
                if(estado.getRegiao().equals(regiao)) {
                    temp = temp + estado;
                }
            }
            temp = temp + "\n";
        }
        return temp;
    }      
    
    
    
}
