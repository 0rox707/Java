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
    //======= inverterVetor(char[]) ======
    static public char[] inverterVetor(char[] vetor){
        char []returno=new char[vetor.length];
        for(int i=vetor.length-1;i>=0;--i){
            returno[(vetor.length-1)-i]=vetor[i];
        }
        return returno;
    }
    //========== visualisarArray (char) =======
    public void vusualisarArray(char vetor[]){
        int i=0;
        for(char x:vetor){
            if (x=='\u0000') {
                continue;
            }
            if(i==0){System.out.print("[");}
            System.out.print("'"+x+"'");
            if(i<vetor.length-1){
                System.out.print(",");
            }
            i++;
        }
        System.out.print("]\n");
    }
    //========== visualisarArray (String) =======
    public void vusualisarArray(String vetor[]){
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
    //======= contarCAracter ==========
    public void contarCaracter(String pala){
        /*OBS: Possue um problema de "loop infinito" ao executar.
        E possue duplicação caso o usuario coloque o mesmo caracteres na busca de caracteres!
        */
        System.out.println("==============\n");
        dd=new Scanner(System.in);
        boolean f=true;
        for(;f;){
            if(pala.equals("")){
                System.out.println("Parametro não passado!\nInformeo ou finalize a execução\nOBS: Para encerrar use ' -- ' \n");
                pala=dd.nextLine();
                System.out.println("==============================\n");
            }else{
                break;
            }
        }
        System.out.println("(Envie apenas um caracter)\nQual caracteres deseja contar?\nOBS: Use ' -- ' para parar de contar ");
        String carContar="",p="";
        for(int i=0;;i++){
            System.out.println("Qual caracter procurar: ");
            p+=dd.next();
            if(p.charAt(0)==' '){
                continue;
            }
            if (p.equals("--")) {
                break;
            }
            
            carContar+=p.charAt(0);
            p="";
        }
        char[] arrayCaracter= corrigirDupicidade(arrayChar(carContar));

        int cont[]=new int[arrayCaracter.length];
        for(int i=0;i<pala.length();i++){
            for(int l=0;l<arrayCaracter.length;l++){
                if(pala.charAt(i)==arrayCaracter[l]){
                    cont[l]+=1;
                }
            }
        }
        System.out.print("Caracteres a procurar > ");
        vusualisarArray(arrayCaracter);
        System.out.println("---------------------");
        int i=0;
        for(char x:arrayCaracter){
            if( '\u0000' == x){
                continue;
            }
            System.out.println("O caracter > "+x+" apareceu "+cont[i]);
            i++;
        }
        dd.close();
    }
    // ================ corrigirDuplicidade ===========
    public char[] corrigirDupicidade(char []vetor){
        char []retono=new char[vetor.length];
        boolean fleg=true;
        int contador=0,veConot=0;
        for(int i=vetor.length-1;i>0;--i){
            // if(i==0){
            //     break;
            // }
            for(int j=((vetor.length-1)-veConot)-1;j>0;--j){
                
                // if(j==0){
                //     break;
                // }
                if(vetor[i]==vetor[j]){
                    fleg=false;
                    retono[contador]=vetor[i]; 
                    
                }
            }
            veConot++;
            if(fleg){
                retono[contador]=vetor[i];
                contador++;
            }
            fleg=true;
        }
        retono[contador]=vetor[0];
        retono=inverterVetor(retono);
        return retono;
    }
}
