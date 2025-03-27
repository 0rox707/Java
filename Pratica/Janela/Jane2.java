/* Aprendendo a adcionar conteudo em uma janela */
package Pratica.Janela;
import javax.swing.*;
public class Jane2 {
    public static void main(String[] args) {
        
        /*Iniciando uma janela JFrema("NomeDaJanela") */
        JFrame janela=new JFrame("Minha janela");
        janela.setSize(600,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Define o leyout de como ficara o conteudo dentro. 'setLeyout(null)' para fazer o leyout manual, se não sera feito altomaticamente */
        janela.setLayout(null);
        
        /* Inicializando uma JLabel("Texto") (rotulo)
         * OBS: representa texto dentro da janela, mas 
         * não pode ser atualizado em execução, apenas em codigo.
        */
        JLabel jleb=new JLabel("Seu nome? ");

        /* setando o leyout do label(posição x, posição y,largura , altura) */
        jleb.setBounds(90,50, 120, 20);

        /* Inicializando uma JTextField(). Campo onde o o usuario digita texto */
        JTextField jtexto=new JTextField();
        jtexto.setBounds(180,50,150, 20 );

        /* inicializando uma JButton("Texto"). inicializa um botão */
        JButton butao=new JButton("Enviar");
        butao.setBounds(190,100,100,25);


        /* Adicionando componentes na janela */
        janela.add(jleb);
        janela.add(jtexto);
        janela.add(butao);

        janela.setVisible(true);


    }
}
