import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pratica7{
    public static void main(String[] args) {
        File arqSobre= new File("arquivos/sobreArcrivo"); 
        File arqFinsl= new File("arquivos/finalArcrivo"); 
        if(!arqSobre.exists()){
            System.out.println("Arquivo não existe! Criando arquivo"+arqSobre.getName());
        }
        if(!arqFinsl.exists()){
            System.out.println("Arquivo não existe! Criando arquivo"+arqFinsl.getName());
            
        }

        System.out.println("==================\nFilewriter (Sbrescrever)");
        try{
            FileWriter escrever = new FileWriter(arqSobre);
            escrever.write("Texto rescrito.\n");
            escrever.write("Oque sera que acontecera");
            escrever.close();
        }catch(IOException e){
            System.out.println("Erro ao escrever.");
        }
        
        System.out.println("==================\nFilewriter (No final)");
        try{
            FileWriter escrever = new FileWriter(arqFinsl,true);
            escrever.write("Texto rescrito.\n");
            escrever.write("Oque sera que acontecera\n");
            escrever.close();
            
        }catch(IOException e){
            
            System.out.println("Erro ao escrever.");
        }
    }
}
