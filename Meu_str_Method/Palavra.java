package Meu_str_Method;
import java.util.Scanner;

public class Palavra {
    static Scanner dd;
    
    
    //======= arrayChar ==========
    public static char[] arrayChar(String str){
        dd=new Scanner(System.in);
        char reto[]=new char[str.length()];
        for(int i=0;(i<str.length());i++){
            reto[i]=str.charAt(i);
        }
        dd.close();
        return reto;
    }
    //======= inverterPalavra ==========
    static String invertePalavra(String p){
        String dp= "";
        for(int i=p.length()-1;i >=0;i-- ){
            dp += p.charAt(i);
        }
        return dp;
    }

    //======= contarCAracter ==========
    public void contarCaracter(String pala){
        dd=new Scanner(System.in);
        
        System.out.println("Qual caracteres deseja contar?\nOBS: ' -- ' para sair");
        String carContar="",caracter;
        for(int i=0;;i++){
            if(i!=0){System.out.println("Qual caracter procurar: ");}
            caracter=dd.next();
            if((caracter.equals("--"))){break;}
            carContar+=caracter;
        }
        System.out.println("caracteres ->"+carContar);

        char[] arrayCaracter=arrayChar(carContar);
        int cont[]=new int[arrayCaracter.length];
        
        for(int i=0;i<pala.length();i++){

            for(int l=0;l<arrayCaracter.length;l++){
                if(pala.charAt(i)==arrayCaracter[l]){
                    cont[l]+=1;
                }
            }
        }
        vusualisarArray(arrayCaracter);
        int i=0;
        for(char x:arrayCaracter){
            System.out.println("O caracter > "+x+" apareceu "+cont[i]);
            i++;
        }
        dd.close();

    }


    //========== visualisarArray (String) =======
    public void vusualisarArray(String vetor[]){
        //{ "ola","Iae","tela"}
        //[0,1,2]
        int i=0;
        for(String x:vetor){
            if(i==0){System.out.print("[");}
            System.out.print("''"+x+"''");
            if(i<vetor.length-1){
                System.out.print(",");
            }
            i++;
        }
        System.out.print("]\n");
    }

    //========== visualisarArray (char) =======
    public void vusualisarArray(char vetor[]){
        int i=0;
        for(char x:vetor){
            if(i==0){System.out.print("[");}
            System.out.print("'"+x+"'");
            if(i<vetor.length-1){
                System.out.print(",");
            }
            i++;
        }
        System.out.print("]\n");
    }
}
