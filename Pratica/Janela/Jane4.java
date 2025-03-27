package Pratica.Janela;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;


public class Jane4 {

    
    
    public static void main(String[] args) {
        String ro="-----------------------";
        JFrame janela= new JFrame("Minha janela");
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,420);


        JLabel rotulo =new JLabel(ro);
        rotulo.setBounds(110, 30, (ro.length()*8),10);

        janela.add(rotulo);
        
        JTextField campoTxt= new JTextField("Digite algo aqui");
        campoTxt.setBounds(120,50,118,30);

        campoTxt.addKeyListener( new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                String texto;
                if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                    texto=campoTxt.getText();
                    campoTxt.setText("");
                    JOptionPane.showMessageDialog(janela, "Texto digitado foi "+texto);
                }
            }
        });
        
        janela.add(campoTxt);
        
        

        janela.setVisible(true);
    }
}
