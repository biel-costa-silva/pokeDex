package database;

import classes.Pokemon;
import classes.Tipo;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Pokemon> pokemons;
    private List<Tipo> tipos;

    public Database(){
        this.pokemons = new ArrayList<>();
        this.tipos = new ArrayList<>();
        
        this.seederTipos(); 
        // this.seederPokemon();
    }

        
    public void seederPokemon(){
        /*
        pokemons.add(new Pokemon(546, "Cottonee", "Planta", "Fada", 50, 0.6f, 30, true)); //Adrian Kauan Aquino de Melo
        pokemons.add(new Pokemon(572, "Minccino","Normal", 50, 5, 4,true));//Ana Louise Lima Silva
        pokemons.add(new Pokemon(103, "Exeggutor", "Planta", 140, 120, 200, true));//Ana Paula de O. de Freitas
        pokemons.add(new Pokemon(696, "Clauncher", "Aquático", 60, 8, 50, true));//André Lucas Silva de Oliveira
        pokemons.add(new Pokemon(109, "koffing","poison",null, 40, 1, 6, true));//Bruno Garcia Souza
        pokemons.add(new Pokemon(194, "Wooper", "Água", "Ground", 55, 8.5f, 40, true));//Bruno Monteiro
        pokemons.add(new Pokemon(215, "Sneseal","Dark", 60, 28,90,true));//Felipe Jazon Lima
        pokemons.add(new Pokemon(50,  "Diglett", "Terra", 40, 0.8f, 20, true));//Gabriel Costa
        pokemons.add(new Pokemon(86,  "Seel", "Agua", 80, 90, 110, true));//Gabriel Pelizari
        pokemons.add(new Pokemon(412, "Burmy", "Bug", 40, 3.4f, 20, true));//Guilherme Yuiti Rufino Okamoto
        pokemons.add(new Pokemon(193, "Yanma","Bug","Flying",70,38.0f,120,true));//Jhimy Kenedy S. Ferrari
        pokemons.add(new Pokemon(599, "Klink", "Aço", 60, 21, 0.3f, true));//João Felipe do Nascimento Lopes
        pokemons.add(new Pokemon(39,  "Jigglypuff", "Normal", "Fada", 70, 5.5f, 50, true));//João Victor Codato Cuculo
        pokemons.add(new Pokemon(515, "Panpour", "Agua", 60, 13, 60, false));//Lívia Maria dos Santos
        pokemons.add(new Pokemon(636, "Larvesta", "inseto", "fogo", 70, 28, 110, true));//Luiz Gustavo Cardoso
        pokemons.add(new Pokemon(77,  "Ponyta", "Fogo", 60, 30, 1, true));//Maria Eduarda Buchweitz Trovilho
        pokemons.add(new Pokemon(391, "Monferno ","Fogo", "Lutador", 64, 22.0f, 90, true));//Matheus Pereira Garcia
        pokemons.add(new Pokemon(21,  "Spearow", "Voador", 60, 2, 30,true));//Murilo Augusto
        pokemons.add(new Pokemon(53,  "Persian", "Normal", 90, 32, 100, false));//Orlando Cabrera
        pokemons.add(new Pokemon(179, "Mareep", "Eletrico", 60, 7.8f, 60, true));//Renan Pacheco Cavalcanti
        pokemons.add(new Pokemon(712, "Bergmite","Gelo",null, 70, 99.5f, 1,true));//Ryan Rigoto
        pokemons.add(new Pokemon(226, "Mantine","Água","Voador",85, 220, 2.1f,false));//WILLIAN WITTIENZO
        pokemons.add(new Pokemon(25, "Pikachu","Eletrico", 35, 6.0f, 40,true));//Pedro Baleroni
        */
    }

    public void seederTipos(){
        Tipo aco = new Tipo("Aço");        
        tipos.add(aco);
        
        Tipo agua = new Tipo("Aguá");
        tipos.add(agua);
        
        Tipo dragao = new Tipo("Dragão");
        tipos.add(dragao);
        
        Tipo eletrico = new Tipo("Eletrico");
        tipos.add(eletrico);
        
        Tipo fada = new Tipo("Fada");
        tipos.add(fada);
        
        Tipo fantasma = new Tipo("Fantasma");
        tipos.add(fantasma);
                  
        Tipo fogo = new Tipo("Fogo");
        tipos.add(fogo);

        Tipo gelo = new Tipo("Gelo");
        tipos.add(gelo);
        
        Tipo inseto = new Tipo("Inseto");
        tipos.add(inseto);
        
        Tipo lutador = new Tipo("Lutador");
        tipos.add(lutador);
        
        Tipo normal = new Tipo("Normal");
        tipos.add(normal);
        
        Tipo pedra = new Tipo("Pedra");
        tipos.add(pedra);
                     
        Tipo planta = new Tipo("Planta");
        tipos.add(planta);
        
        Tipo psiquico = new Tipo("Psiquico");
        tipos.add(psiquico);
        
        Tipo sombrio = new Tipo("Sombrio");
        tipos.add(sombrio);
                
        Tipo terrestre = new Tipo("Terrestre");
        tipos.add(terrestre);
        
        Tipo venenoso = new Tipo("Venenoso");
        tipos.add(venenoso);
        
        Tipo voador = new Tipo("Voador");
        tipos.add(voador);
        
        //Aloca fraqueza e resistencia
                
        List fraquezaAco = new ArrayList<>(List.of(fogo, terrestre, lutador));
        List resistenciaAco = new ArrayList<>(List.of(aco, inseto, planta, dragao,voador, gelo, pedra, psiquico, normal, fada, venenoso, venenoso));
        aco.setFraquezas(fraquezaAco);
        aco.setResistencias(resistenciaAco);
        
        List fraquezaAgua = new ArrayList<>(List.of(planta, eletrico));
        List resistenciaAgua = new ArrayList<>(List.of(aco, agua, fogo, gelo));
        agua.setFraquezas(fraquezaAgua);
        agua.setResistencias(resistenciaAgua);
        
        List fraquezaDragao = new ArrayList<>(List.of(dragao, fada, gelo));
        List resistenciaDragao = new ArrayList<>(List.of(agua, eletrico, fogo, planta));
        dragao.setFraquezas(fraquezaDragao);
        dragao.setResistencias(resistenciaDragao);
        
        List fraquezaEletrico = new ArrayList<>(List.of(terrestre));
        List resistenciaEletrico = new ArrayList<>(List.of(aco, eletrico, voador));
        eletrico.setFraquezas(fraquezaEletrico);
        eletrico.setResistencias(resistenciaEletrico);
        
        List fraquezaFada = new ArrayList<>(List.of(aco, venenoso));
        List resistenciaFada = new ArrayList<>(List.of(inseto, lutador, sombrio, dragao, dragao));
        fada.setFraquezas(fraquezaFada);
        fada.setResistencias(resistenciaFada);
        
        List fraquezaFantasma = new ArrayList<>(List.of(fantasma, sombrio));
        List resistenciaFantasma = new ArrayList<>(List.of(inseto, venenoso, lutador, lutador, normal, normal));
        fantasma.setFraquezas(fraquezaFantasma);
        fantasma.setResistencias(resistenciaFantasma);
        
        List fraquezaFogo = new ArrayList<>(List.of(agua, pedra, terrestre));
        List resistenciaFogo = new ArrayList<>(List.of(aco, fada, gelo, fogo, inseto, planta));
        fogo.setFraquezas(fraquezaFogo);
        fogo.setResistencias(resistenciaFogo);
        
        List fraquezaGelo = new ArrayList<>(List.of(aco, fogo, lutador, pedra));
        List resistenciaGelo = new ArrayList<>(List.of(gelo));
        gelo.setFraquezas(fraquezaGelo);
        gelo.setResistencias(resistenciaGelo);
        
        List fraquezaInseto = new ArrayList<>(List.of(fogo, pedra, voador));
        List resistenciaInseto = new ArrayList<>(List.of(lutador, planta, terrestre));
        inseto.setFraquezas(fraquezaInseto);
        inseto.setResistencias(resistenciaInseto);
        
        List fraquezaLutador = new ArrayList<>(List.of(fada, psiquico, voador));
        List resistenciaLutador = new ArrayList<>(List.of(inseto, pedra, sombrio));
        lutador.setFraquezas(fraquezaLutador);
        lutador.setResistencias(resistenciaLutador);
        
        List fraquezaNormal = new ArrayList<>(List.of(lutador));
        List resistenciaNormal = new ArrayList<>(List.of(fantasma, fantasma));
        normal.setFraquezas(fraquezaNormal);
        normal.setResistencias(resistenciaNormal);
        
        List fraquezaPedra = new ArrayList<>(List.of(aco, agua, lutador, planta, terrestre));
        List resistenciaPedra = new ArrayList<>(List.of(fogo, normal, venenoso, voador));
        pedra.setFraquezas(fraquezaPedra);
        pedra.setResistencias(resistenciaPedra);
        
        List fraquezaPlanta = new ArrayList<>(List.of(fogo, gelo, inseto, venenoso, voador));
        List resistenciaPlanta = new ArrayList<>(List.of(agua, eletrico, planta, terrestre));
        planta.setFraquezas(fraquezaPlanta);
        planta.setResistencias(resistenciaPlanta);
        
        List fraquezaPsiquico = new ArrayList<>(List.of(fantasma, inseto, sombrio));
        List resistenciaPsiquico = new ArrayList<>(List.of(lutador, psiquico));
        psiquico.setFraquezas(fraquezaPsiquico);
        psiquico.setResistencias(resistenciaPsiquico);
        
        List fraquezaSombrio = new ArrayList<>(List.of(fada, inseto, lutador));
        List resistenciaSombrio = new ArrayList<>(List.of(fantasma, sombrio, psiquico, psiquico));
        sombrio.setFraquezas(fraquezaSombrio);
        sombrio.setResistencias(resistenciaSombrio);
        
        List fraquezaTerrestre = new ArrayList<>(List.of(agua, gelo, planta));
        List resistenciaTerrestre = new ArrayList<>(List.of(pedra, venenoso, eletrico, eletrico));
        terrestre.setFraquezas(fraquezaTerrestre);
        terrestre.setResistencias(resistenciaTerrestre);
        
        List fraquezaVenenoso = new ArrayList<>(List.of(psiquico, terrestre));
        List resistenciaVenenoso = new ArrayList<>(List.of(fada, inseto, lutador, planta, venenoso));
        venenoso.setFraquezas(fraquezaVenenoso);
        venenoso.setResistencias(resistenciaVenenoso);
        
        List fraquezaVoador = new ArrayList<>(List.of(eletrico, gelo, pedra));
        List resistenciaVoador = new ArrayList<>(List.of(inseto, lutador, planta, terrestre, terrestre));
        voador.setFraquezas(fraquezaVoador);
        voador.setResistencias(resistenciaVoador);        
    }
    
    public Pokemon buscaPokemon(int id) {
        for(Pokemon p : pokemons){
            if(p.getNumero() == id){
                return p;
            }
        }
        return null;
    }

    public Tipo buscaTipo(String nome){
        for(Tipo t: tipos){
            if(t.getNome() == nome){
                return t;
            }
        }
        return null;
    }
}
