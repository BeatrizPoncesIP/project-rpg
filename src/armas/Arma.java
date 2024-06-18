/**
 * Classe abstrata que representa uma arma em um jogo de RPG.
 * Esta classe define as características básicas de uma arma, como nome e modificador de dano.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas;

public abstract class Arma {

    private String nome;
    
    /** O modificador de dano da arma. */
    private double modDano;

    /**
     * Construtor da classe Arma.
     * 
     * @param nome O nome da arma.
     * @param modDano O modificador de dano da arma.
     */
    protected Arma(String nome, double modDano) {
        this.nome = nome;
        this.modDano = modDano;
    }

    /**
     * Obtém o nome da arma.
     *
     * @return O nome da arma.
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Obtém o modificador de dano da arma.
     *
     * @return O modificador de dano da arma.
     */
    public double getModDano(){
        return this.modDano;
    }
}