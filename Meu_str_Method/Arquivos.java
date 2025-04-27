package Meu_str_Method;
import java.io.*;
public class Arquivos {
    protected FileReader lerAquivo;

    
    
    
    public void lerArquivo(String arquiNome){
        try{
            
            lerAquivo= new FileReader(arquiNome);

        }catch(IOException e){
            System.out.println(e.getMessage()+"\nErro ao ler o arquivo.");
        }
    }


}
