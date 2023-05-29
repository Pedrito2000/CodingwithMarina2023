package UF3.GenerarFitxerNotes;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerarFitxerNotes {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static final int a = -1;
    public static void main (String[] args) {
        GenerarFitxerNotes programa = new GenerarFitxerNotes();
        programa.inici();
    }
    public void inici() {
        try {
            File f = new File("C:\\Users\\darth\\DAM\\Programacio\\CodiwithMarina2023\\src\\UF3\\LlegirNotesMarca\\NotesMarca.txt");
            Scanner lector = new Scanner(f);
            boolean llegir = true;
            PrintStream Pedro = new PrintStream("C:\\Users\\darth\\DAM\\Progamacio\\CodiwithMarina2023\\src\\UF3\\GenerarFitxerNotes\\PrintStream.txt");
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    //System.out.print("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    //System.out.println("− Mitjana: " + mitjana);
                    {
                        Pedro.println(nom + cognom+ mitjana);
                    }
                }

            }
            //Cal tancar el fitxer
            lector.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public double llegirNotes(Scanner lector) {
        double res = 0;
        try {
            //Es fan lectures. Cal controlar excepcions també!
            int count = 0;
            double numNotes = lector.nextDouble();
            while (numNotes != a){
                //S’acumula el valor de les notes
                res = res + numNotes;
                count++;
                numNotes = lector.nextDouble();
            }
            //Es calcula nota mitjana
            res = res/numNotes;
        }
        catch (Exception e) {
            //Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
