import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        int nbtotalmot = 0;
        File fichiers = new File("TestExercice3.txt");
        Scanner scanner = new Scanner(fichiers);
        while (scanner.hasNextLine()) {
            String ligne = scanner.nextLine();
            String[] mot = ligne.split(" ");
            int nbrmot = mot.length;
            nbtotalmot += nbrmot;
        }
        scanner.close();
        System.out.println("Le nombre total de mot est : " + nbtotalmot);
    }
}