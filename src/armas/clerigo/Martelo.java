/**
 * Classe final que representa um martelo específico para clérigos em um jogo de RPG.
 * 
 * Esta classe estende a classe abstrata ArmaClerigo, herdando suas características básicas.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Esta classe foi implementada como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package armas.clerigo;

public final class Martelo extends ArmaClerigo{
    
    /**
     * Construtor da classe Martelo.
     * Inicializa a arma com o nome "Martelo" e um modificador de dano de 0.6.
     */
    public Martelo() {
        super("Martelo", 0.6);
    }
}