/**
 * Classe que representa um personagem clérigo em um jogo de RPG.
 * Um clérigo é um tipo específico de personagem que herda as características básicas de um Personagem,
 * incluindo nome, saúde, força, destreza e uma arma específica para clérigos.
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
import armas.clerigo.ArmaClerigo;

public final class Clerigo extends Personagem{

    /**
     * Construtor da classe Clerigo.
     * 
     * @param saude A saúde inicial do clérigo.
     * @param forca A força do clérigo.
     * @param destreza A destreza do clérigo.
     * @param arma A arma específica para clérigos equipada pelo clérigo.
     */
    public Clerigo(double saude, double forca, double destreza, ArmaClerigo arma) {
        super("Clérigo", saude, forca, destreza, arma);
    }
    
}
