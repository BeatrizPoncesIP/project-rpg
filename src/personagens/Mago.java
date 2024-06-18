/**
 * Classe que representa um personagem mago em um jogo de RPG.
 * Um mago é um tipo específico de personagem que herda as características básicas de um Personagem,
 * incluindo nome, saúde, força, destreza e uma arma específica para magos.
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
import armas.mago.ArmaMago;

public final class Mago extends Personagem{

    /**
     * Construtor da classe Mago.
     * 
     * @param saude A saúde inicial do mago.
     * @param forca A força do mago.
     * @param destreza A destreza do mago.
     * @param arma A arma específica para magos equipada pelo mago.
     */
    public Mago(double saude, double forca, double destreza, ArmaMago arma) {
        super("Mago", saude, forca, destreza, arma);
    }
    
}

