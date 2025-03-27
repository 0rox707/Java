package Pratica.Janela;

import java.awt.event.*;
import javax.swing.*;

public class Jane3 {
    public static void main(String[] args) {
        JFrame frame =new JFrame("captura de dados");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lebel=new JLabel("Digite algo: ");
        //obs: Quanto maior o y mais baixo fica;
        lebel.setBounds(80,20, 90,40);


        JTextField textInsert = new JTextField();
        textInsert.setBounds(80, 55, 80, 40);
        
        //Criando evento ao aperatar o enter

        textInsert.addKeyListener(new KeyAdapter() {
            
            public void keyPressed(KeyEvent e){
                String texto;
                /*
                KeyEvent.'Chave_da_tecla.'. se a 
                */
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    texto= textInsert.getText();
                    textInsert.setText("");
                    JOptionPane.showMessageDialog(frame, "Texto digitado: "+texto );

                    lebel.setText("Testando");
                    
                }
                
            }
        
        
        });

        JButton butao =new JButton("enviar");
        butao.setBounds(100, 120, 70, 24);

        

        /* Crindo ação para o botão capturar o texto digitado; */

        butao.addActionListener( new ActionListener() {
                
            public void actionPerformed(ActionEvent e){ 
                
                textInsert.setText("");

                /*Pegando texto da caixa de texto */
                String texto= textInsert.getText();
                // Abre uma nova janela popup, com o conteudo seginte.
                JOptionPane.showMessageDialog(frame, "Você digitou: "+texto);

            }
        
        
        });
    



        frame.add(lebel);
        frame.add(textInsert);
        frame.add(butao);

        frame.setVisible(true);
    }
    
}
