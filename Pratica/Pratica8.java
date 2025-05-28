import java.io.*;
public class Pratica8 {
    public static void main(String[] args) {
        
        System.out.println("=========BufferWriter=========");
        try{

        BufferedWriter linhEscrever = new BufferedWriter(new FileWriter("Pratica/TesteArquivo/BufflerWriter.txt",true));
        linhEscrever.write("Linha nova");
        linhEscrever.newLine();
        linhEscrever.write("Este arquivo sera sobrescrito sempe que for executado");
        linhEscrever.flush();
    
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
