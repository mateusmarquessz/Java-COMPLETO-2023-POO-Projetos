import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Mateus\\Documents\\Estudos\\Java-COMPLETO-2023-POO-Projetos\\Trabalhando com Arquivos\\Classes File e Scanner");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            if(sc !=null){
                sc.close();
            }
        }

    }
}