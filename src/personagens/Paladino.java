/**
 * Classe que representa um personagem paladino em um jogo de RPG.
 * Um paladino é um tipo específico de personagem que herda as características básicas de um Personagem,
 * incluindo nome, saúde, força, destreza e uma arma específica para paladinos.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Esta classe foi implementada como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package personagens;
import armas.paladino.ArmaPaladino;

public final class Paladino extends Personagem{

    /**
     * Construtor da classe Paladino.
     * 
     * @param saude A saúde inicial do paladino.
     * @param forca A força do paladino.
     * @param destreza A destreza do paladino.
     * @param arma A arma específica para paladinos equipada pelo paladino.
     */
    public Paladino(double saude, double forca, double destreza, ArmaPaladino arma) {
        super("Paladino", saude, forca, destreza, arma);
    }
    
}
