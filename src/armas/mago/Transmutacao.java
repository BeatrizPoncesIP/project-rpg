/**
 * Classe final que representa uma arma mágica específica para magos,
 * focada na magia da transmutação, em um jogo de RPG.
 * 
 * Esta classe estende a classe abstrata ArmaMago, herdando suas características básicas.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas.mago;

public final class Transmutacao extends ArmaMago {

    /**
     * Construtor da classe Transmutacao.
     * Inicializa a arma com o nome "Magia da Transmutacao" e um modificador de dano de 0.25.
     */
    public Transmutacao() {
        super("Magia da Transmutação", 0.25);
    }
}
