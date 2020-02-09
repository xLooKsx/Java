package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

//        pessoas.forEach((id, nome) ->{
//        	System.out.println("Id: "+id+", nome: "+nome);
//        });
        
        /*
         * Imprimindo as chaves
         */
        Set<Integer> chaves = pessoas.keySet();    
        for (Integer id : chaves) {
            System.out.println(id);
        }
        
        /*
         * Imprimindo os valores
         */
        Collection<String> valores = pessoas.values();
        for (String nome : valores) {
            System.out.println(nome);
        }
        
        /*
         * Imprimindo as associações
         */
        Set<Entry<Integer, String>> associacoes = pessoas.entrySet();    
        for (Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}