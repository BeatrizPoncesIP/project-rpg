/**
 * Classe final que representa uma espada específica para paladinos em um jogo de RPG.
 * 
 * Esta classe estende a classe abstrata ArmaPaladino, herdando suas características básicas.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas.paladino;

public final class Espada extends ArmaPaladino {

    /**
     * Construtor da classe Espada.
     * Inicializa a arma com o nome "Espada" e um modificador de dano de 0.3.
     */
    public Espada() {
        super("Espada", 0.3);
    }
}
