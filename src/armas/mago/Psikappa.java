/**
 * Classe final que representa uma arma mágica específica para magos,
 * focada na habilidade Psi-kappa, em um jogo de RPG.
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

public final class Psikappa extends ArmaMago {

    /**
     * Construtor da classe Psikappa.
     * Inicializa a arma com o nome "Psi-kappa" e um modificador de dano de 0.5.
     */
    public Psikappa() {
        super("Psi-kappa", 0.5);
    }
}