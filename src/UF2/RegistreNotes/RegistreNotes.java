package UF2.RegistreNotes;

import java.util.Scanner;

public class RegistreNotes {
    public static void main(String[] args) {
        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }
    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        Min programa = new Min();
        Max programa1 = new Max();
        Mitjana programa2 = new Mitjana();
        double min = programa.calcularMinim(notes);
        double max = programa1.calcularMaxim(notes);
        double mitjana = programa2.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}

