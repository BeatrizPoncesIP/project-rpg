/**
 * Classe principal do jogo de RPG.
 * 
 * Esta classe contém o método principal que inicia o jogo e permite a criação de personagens e a execução de ataques entre eles.
 * Os personagens são criados com base na entrada do usuário, e as armas são atribuídas de acordo com os valores fornecidos.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-05-23
 * 
 * Este algoritmo foi implementado como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package rpg;

import java.util.Scanner;
import armas.clerigo.*;
import armas.mago.*;
import armas.paladino.*;
import personagens.*;

public class Rpg {
    
    /**
     * Método principal que inicia o jogo de RPG.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        // Criação do personagem 1:

        int personagem = teclado.nextInt();
        int saude = teclado.nextInt();
        int forca = teclado.nextInt();
        int destreza = teclado.nextInt();
        int arma = teclado.nextInt();
        
        Personagem personagem_1 = criaPersonagem(personagem, saude, forca, destreza, arma);
        
        // Criação do personagem 2:
        personagem = teclado.nextInt();
        saude = teclado.nextInt();
        forca = teclado.nextInt();
        destreza = teclado.nextInt();
        arma = teclado.nextInt();
        Personagem personagem_2 = criaPersonagem(personagem, saude, forca, destreza, arma);

        // Impressão do status:
        personagem_1.printStatus();
        personagem_2.printStatus();

        // Ataques
        int atacante = teclado.nextInt();
        int defensor; // variavel inutil, serve apenas como buffer.

        while (atacante != 0) {

            defensor = teclado.nextInt();

            if (atacante == 1) {
                personagem_1.atacar(personagem_2);
            } else {
                personagem_2.atacar(personagem_1);
            }

            atacante = teclado.nextInt();
            
        }

        teclado.close();
    }

    /**
     * Cria um personagem baseado no índice fornecido e configura seus atributos.
     * 
     * @param indice_personagem O índice do tipo de personagem (1: Mago, 2: Paladino, 3: Clérigo).
     * @param saude A saúde inicial do personagem.
     * @param forca A força do personagem.
     * @param destreza A destreza do personagem.
     * @param indice_arma O índice da arma a ser equipada pelo personagem.
     * @return O personagem criado, ou lança o erro IllegalArgumentException se os índices forem inválidos.
     */
    public static Personagem criaPersonagem(int indice_personagem, int saude, int forca, int destreza, int indice_arma){

        switch (indice_personagem) {
            case 1: // Mago
                
                if (indice_arma == 1){
                    ArmaMago arma = new Transmutacao();
                    Personagem personagem = new Mago(saude, forca, destreza, arma);
                    return personagem;
                } else if (indice_arma == 2){
                    ArmaMago arma = new Psikappa();
                    Personagem personagem = new Mago(saude, forca, destreza, arma);
                    return personagem;
                } else {
                    throw new IllegalArgumentException("Índice de arma inválido para Mago: " + indice_arma);
                }

            case 2: // Paladino
                
                if (indice_arma == 1){
                    ArmaPaladino arma = new Espada();
                    Personagem personagem = new Paladino(saude, forca, destreza, arma);
                    return personagem;
                } else if (indice_arma == 2){
                    ArmaPaladino arma = new Lanca();
                    Personagem personagem = new Paladino(saude, forca, destreza, arma);
                    return personagem;
                } else {
                    throw new IllegalArgumentException("Índice de arma inválido para Paladino: " + indice_arma);
                }

            case 3: // Clérigo
                
                if (indice_arma == 1){
                    ArmaClerigo arma = new Martelo();
                    Personagem personagem = new Clerigo(saude, forca, destreza, arma);
                    return personagem;
                } else if (indice_arma == 2){
                    ArmaClerigo arma = new Maca();
                    Personagem personagem = new Clerigo(saude, forca, destreza, arma);
                    return personagem;
                } else {
                    throw new IllegalArgumentException("Índice de arma inválido para Clérigo: " + indice_arma);
                }
        
            default: // Erro
                throw new IllegalArgumentException("Índice de personagem inválido: " + indice_personagem);
        }
    }
}