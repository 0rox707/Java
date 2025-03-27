package Pratica.Janela;
import javax.swing.JFrame; //Importando a class JFrame

public class Jane1 {
    public static void main(String[] args) {
        /*inicializando uma class JFRame. 'JFrame("nome da janela")*/
        JFrame janela=new JFrame("Nome da janela");

        /*Definindo tamanho da janela. 'setFrame(largura, altura)' */
        janela.setSize(500, 300);

        /*Definindo comportamento da janela ao fechar. 'setDefaltCloseOperetion(encerrar programa)' */
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /* Define a visibilidade da janela. 'setVisible(Valor bool)' */
        janela.setVisible(true);


    }
}
