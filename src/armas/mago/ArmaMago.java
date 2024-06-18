/**
 * Classe abstrata que representa uma arma específica para magos em um jogo de RPG.
 * Esta classe estende a classe abstrata Arma, herdando suas características básicas.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas.mago;
import armas.Arma;

public abstract class ArmaMago extends Arma{

    /**
     * Construtor protegido da classe ArmaMago.
     * 
     * @param nome O nome da arma.
     * @param modDano O modificador de dano da arma.
     */
    protected ArmaMago(String nome, double modDano) {
        super(nome, modDano);
    }
}
