import java.util.Scanner;
import Meu_str_Method.Palavra;


public class Ip {
    static Scanner dd= new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Digite um IP e uma MASK: ");
        String ip=dd.next(),mask=dd.next();
        interRede(host(ip,mask));
    }
    static int host(String ip,String mask){
        Palavra p = new Palavra();
        String calHo = "";
        String m[] = mask.split("\\.");
        int subMask= Integer.parseInt(m[3]);
        int ho= (255 - subMask);
        System.out.println("Numero de hosts validos:"+(ho-2)+ "\nNumero de host total: "+(ho));
        return ho;
    }
    static void interRede(int  h){
        System.out.println("intervalo: ");
        int inicio=0,fim=h/* */;
        for(int o=0;o<20;o++){
            System.out.println((char)(97+o)+": "+ (inicio)+" ate "+(fim));
            
            if(fim >= 255){
                break;
            }
            inicio=fim+1;
            fim+=1+h;
        }
    }
}
