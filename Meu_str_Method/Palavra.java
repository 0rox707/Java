package Meu_str_Method;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

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
    public static void visualisarArray(char vetor[]){
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
        //   Ainda mantem algumas duplicidade
        char []retono=new char[vetor.length];
        boolean fleg=true;
        int contador=0,veConot=0;
        for(int i=vetor.length-1;i>0;--i){
            for(int j=((vetor.length-1)-veConot)-1;j>0;--j){
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
    //=========== descript =============
    public String descript(String txt){
        char[] upperCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toCharArray(),
        lowerCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toLowerCase().toCharArray(),
        novoCaracter="æßIðđV₢i≈ʋFlqħµv¬%ŋ∆øŧʝ§þ~@".toCharArray();
        boolean flag=false;
        String retorno="";
        for(int i=0;i<=txt.length()-1;i++){
            if(txt.charAt(i)=='·'){
                i++;
                flag=true;
            }
            if(txt.charAt(i)==' '|| txt.charAt(i)==','||txt.charAt(i)=='.'||txt.charAt(i)=='?'||txt.charAt(i)=='!'){
                retorno+=txt.charAt(i);
                continue;
            }
            for(int l=0;l<=upperCaracter.length-1;l++){
                if(flag){
                    if(txt.charAt(i)==novoCaracter[l]){
                        retorno+=upperCaracter[l];
                        flag=false;
                        continue;
                    }
                }else{
                    if(txt.charAt(i)==novoCaracter[l]){
                        retorno+=lowerCaracter[l];
                        flag=false;
                        continue;
                        }
                }
                
            }
        }
        return retorno;
    }
    //========= descript_ =====
    public void descript_(String txt)throws InterruptedException{

        char[] upperCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toCharArray(),
        lowerCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toLowerCase().toCharArray(),
        novoCaracter="æßIðđV₢i≈ʋFlqħµv¬%ŋ∆øŧʝ§þ~@".toCharArray();
        boolean flag=false;
        for(int i=0;i<=txt.length()-1;i++){
            if(txt.charAt(i)=='·'){
                i++;
                flag=true;
            }
            if(txt.charAt(i)==' '|| txt.charAt(i)==','||txt.charAt(i)=='.'||txt.charAt(i)=='?'||txt.charAt(i)=='!'){
                System.out.print(txt.charAt(i));
                continue;
            }
            for(int l=0;l<=upperCaracter.length-1;l++){
                if(flag){
                    if(txt.charAt(i)==novoCaracter[l]){
                        System.out.print(upperCaracter[l]);
                        flag=false;
                        continue;
                    }
                }else{
                    if(txt.charAt(i)==novoCaracter[l]){
                        System.out.print(lowerCaracter[l]);
                        flag=false;
                        continue;
                        }
                }
                
            }
        }
        System.out.println();
    }

    //========== in_cript_ =================
    public void in_cript_(String txt)throws InterruptedException{

        char[] upperCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toCharArray(),
        lowerCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toLowerCase().toCharArray(),
        novoCaracter="æßIðđV₢i≈ʋFlqħµv¬đŋ∆øŧʝ§þ~@".toCharArray();
        String returno="";
        int i=0;
        for(char x: txt.toCharArray()){
            for(int j=0;j<27;j++){
                if (x==' '|| x==',' ||x== '.'||x== '?'|| x=='!') {
                    Thread.sleep((60)*2);
                    System.out.print(x);
                    break;
                }
                if(x==upperCaracter[j]){
                    Thread.sleep((60)*2);
                    System.out.print("·"+novoCaracter[j]);
                    break;
                }
                if(x==lowerCaracter[j]){
                    Thread.sleep((60)*2);
                    System.out.print(novoCaracter[j]);
                    break;
                }
            }
            i++;
        }
        System.out.println("");
    }

    //========== in_cript =================
    public String in_cript(String txt){

        // Não aceita caracteres acentuados.
        char[] upperCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toCharArray(),
        lowerCaracter="ABCDEFGHIJKLNMOPQRSTUVWXYZÇ".toLowerCase().toCharArray(),
        novoCaracter="æßIðđV₢i≈ʋFlqħµv¬%ŋ∆øŧʝ§þ~@".toCharArray();
        String returno="";
        int i=0;
        for(char x: txt.toCharArray()){
            for(int j=0;j<27;j++){
                if (x==' '|| x==',' || x== '.'|| x== '?'|| x=='!') {
                    returno+=x;
                    break;
                }
                if(x==upperCaracter[j]){
                    returno+=("·"+novoCaracter[j]);
                    break;
                }
                if(x==lowerCaracter[j]){
                    returno+=novoCaracter[j];
                    break;
                }
            }
            i++;
        }
        return returno;
    }


}
