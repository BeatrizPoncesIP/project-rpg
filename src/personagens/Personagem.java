/**
 * Classe abstrata que representa um personagem genérico em um jogo de RPG.
 * Cada personagem possui um nome, saúde, força, destreza e uma arma.
 * Esta classe define métodos para status, ataque, cálculo de dano e verificação de morte.
 * 
 * Autor: Beatriz da Silva Ponces
 * Email: beatrizponces.oficial@gmail.com
 * Data de Criação: 2024-05-23
 * Última modificação 2024-06-18
 * 
 * Esta classe foi implementada como parte do Trabalho Prático da disciplina de Linguagem de Programação Orientada a Objetos,
 * orientado pelo professor Renan Albuquerque Marks.
 */

package personagens;
import armas.Arma;

public abstract class Personagem {

    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    /**
     * Construtor protegido da classe Personagem.
     * 
     * @param nomeTipo O nome do tipo de personagem.
     * @param saude A saúde inicial do personagem.
     * @param forca A força do personagem.
     * @param destreza A destreza do personagem.
     * @param arma A arma equipada pelo personagem.
     */
    protected Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {

        if(saude < 0.0 || forca < 0.0 || destreza < 0.0 || saude > 10.0 || forca > 10.0 || destreza > 10.0){
            throw new IllegalArgumentException("Os valores de saude, forca e destreza devem estar entre 0 e 10.");
        }

        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    /**
     * Imprime o status atual do personagem.
     * Se o personagem estiver morto, exibe uma mensagem especial.
     */
    public void printStatus(){
        if (estaMorto()){
            System.out.printf("%s [Morto, Forca: %.1f, Destreza: %.1f, %s]\n", this.nomeTipo, this.forca, this.destreza, this.arma.getNome());
        }
        else{
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n", this.nomeTipo, this.saude, this.forca, this.destreza, this.arma.getNome());
        }
    }

    /**
     * Método que realiza o ataque do personagem contra outro personagem.
     * 
     * @param inimigo O personagem inimigo que será atacado.
     */
    public void atacar(Personagem inimigo){

        // Verifica se o personagem A está vivo:
        if (estaMorto()) {
            System.out.printf("O %s não consegue atacar, pois está morto.\n", this.nomeTipo);
        }
        
        else{

            System.out.printf("O %s ataca o %s com %s.\n", this.nomeTipo, inimigo.nomeTipo, this.arma.getNome());

            // Verifica se o personagem B está vivo:
            if(inimigo.estaMorto()){
                System.out.printf("Pare! O %s já está morto!\n", inimigo.nomeTipo);
            }
            
            else {

                double dano = 0;

                // Ataque bem sucedido:
                if (this.destreza > inimigo.destreza){

                    // Calcula dano:
                    dano = this.calculaDano();
                    
                    // Inimigo recebe dano:
                    inimigo.recebeDano(dano);
                    System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n", dano);

                }

                // Ataque defendido:
                else if (this.destreza == inimigo.destreza) {
                    System.out.println("O ataque foi defendido, ninguem se machucou!\n");
                }

                // Ataque mal sucedido:
                else {

                    // Calcula dano:
                    dano = inimigo.calculaDano();

                    // Recebe dano:
                    this.recebeDano(dano);
                    System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", dano);
                }
            }
        }

        this.printStatus();
        inimigo.printStatus();
    }

    /**
     * Calcula o dano do personagem baseado em sua força e na modificação de dano da arma.
     * 
     * @return O valor do dano calculado.
     */
    private double calculaDano(){
        return this.forca * this.arma.getModDano();
    }

    /**
     * Recebe um determinado valor de pontos de dano, diminuindo a saúde do personagem.
     * 
     * @param pontosDano Os pontos de dano a serem recebidos.
     */
    private void recebeDano(double pontosDano){
        this.saude -= pontosDano;
    }

    /**
     * Verifica se o personagem está morto com base em sua saúde.
     * 
     * @return true se o personagem estiver morto, false caso contrário.
     */
    private boolean estaMorto(){
        if (this.saude < 1.0){
            return true;
        }
        return false;
    }
}