package Meu_str_Method;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
public class Leitura_Arquivo {
    static Scanner dd;
    static File file;

    //---- ler (void) ----
    public void ler(String nome){
        dd=new Scanner(System.in);
        file=new File(nome);
        for(;;){
            if(file.exists()==false){
                System.out.println("Arquivo não existe!\nInforme o nome ou finalize a execção!\n'( -- ) Para sair'");
                String n=dd.next();
                file =new File(n);
                if(n.equals("--")){
                    
                    try {
                        for(int i=1;i<3;i++){
                            System.out.print(".");
                        }
                        System.out.println(".\n");
                        return;
                    } catch (Exception e) {
                        System.out.println("Ouve algum erro! Finalização forçada.");
                        System.exit(0);
                    }
                }                
            }else{
                break;
            }
        }
        
        FileReader fr;
        try {
            fr=new FileReader(file);
            
            int x;
            System.out.println("\n----------------\n");
            while (((x = fr.read())!= -1)) {
                Thread.sleep((30));
                System.out.print((char)x);
            }
        }catch(InterruptedException e){
            System.out.println("falha no temporizador Thread.slep");
        }catch (FileNotFoundException e) {
            System.out.println("Falha ao abrir arquivo\nArquivo não encontrado:");
            System.exit(0);
        }catch(IOException e){
            System.out.println("Algo deu errado!");
            System.exit(0);
        }
        
        System.out.println("");

        
    }

    //--- ler (String) ---
    
    public String ler_(String nome){
        dd=new Scanner(System.in);
        file=new File(nome);
        for(;;){
            if(file.exists()==false){
                System.out.println("Arquivo não existe!\nInforme o nome ou finalize a execção!\n'( -- ) Para sair'");
                String n=dd.next();
                file =new File(n);
                if(n.equals("--")){
                    
                    try {
                        for(int i=1;i<3;i++){
                            System.out.print(".");
                        }
                        System.out.println(".\n");
                        System.exit(0);
                    } catch (Exception e) {
                        System.out.println("Ouve algum erro! Finalização forçada.");
                        System.exit(0);
                    }
                }                
            }else{
                break;
            }
        }
        
        FileReader fr;
        String retorno="";
        try {
            fr=new FileReader(file);
            int x;
            System.out.println("\n----------------\n");
            while (((x = fr.read())!= -1)) {
                retorno+=(char)x;
            }
        }catch (FileNotFoundException e) {
            System.out.println("Falha ao abrir arquivo\nArquivo não encontrado:");
            System.exit(0);
        }catch(IOException e){
            System.out.println("Algo deu errado!");
            System.exit(0);
        }
        
        

        return retorno;
    }
}
