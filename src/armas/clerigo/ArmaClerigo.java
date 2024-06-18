/**
 * Classe abstrata que representa uma arma específica para clerigos em um jogo de RPG.
 * Esta classe estende a classe abstrata Arma, herdando suas características básicas.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas.clerigo;
import armas.Arma;

public abstract class ArmaClerigo extends Arma{

    /**
     * Construtor protegido da classe ArmaClerigo.
     * 
     * @param nome O nome da arma.
     * @param modDano O modificador de dano da arma.
     */
    protected ArmaClerigo(String nome, double modDano) {
        super(nome, modDano);
    }
}