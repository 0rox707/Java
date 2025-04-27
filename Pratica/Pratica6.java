import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class Pratica6 {

    
    public static void main(String[] args) {
        System.out.println("===============\nFileReader");
        File arqR = new File("DadoR.txt");
        File arqB = new File("DadoB.txt");
        File arqS = new File("DadoS");
        
        if (!arqR.exists()) {
            System.out.println("Arquivo "+arqR.getName()+" não existe");
            System.exit(0);
        }
        if (!arqB.exists()) {
            System.out.println("Arquivo "+arqB.getName()+ " não existe");
            System.exit(0);
        }
        try{
            
            FileReader carLer = new FileReader(arqR);
            int i=carLer.read();
            while (i!=-1) {
                System.out.print((char)i/*+" < i \n"*/);
                i=carLer.read();
                
            }
            carLer.close();
        }catch(IOException i){
            System.out.println("Erro ao ler");
        }
        
        System.out.println("\n==================\nBufferedReader");
        try {
            BufferedReader linLer= new BufferedReader(new FileReader(arqB));
            String i = linLer.readLine();
            while(i!=null){
                System.out.println(i);
                i=linLer.readLine();
            }
            linLer.close();
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo!");
        }
        System.out.println("\n==================\nScanner");
        try {
            Scanner scnLer = new Scanner(arqS);
            while (scnLer.hasNextLine()) {
                System.out.println(scnLer.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
