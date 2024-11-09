import java.io.IOException;

public class App {
    
    public static void main(String[] args)throws InterruptedException {
        Menu mn=new Menu();
        //mn.menu();
        System.out.println(System.getProperty("os.name").contains("Mac"));
        
        //clear();
    }

    public static void clear() {
        try {
            // Verifica se o sistema operacional é macOS ou outro
            if (System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                // Para outros sistemas, pode incluir mais condições, se necessário
                System.out.println("Sistema operacional não suportado para limpar o terminal.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
