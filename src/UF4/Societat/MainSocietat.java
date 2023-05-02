package UF4.Societat;
import UF4.Persona.Persona;


public class MainSocietat {

    public static void main(String[] args) {
        Persona P1 = new Persona("23923294M","Pedro",22);
        Persona P2 = new Persona ();
        P2.setDni("00000000Q");
        P2.setEdat(27);
        P2.setNom("Andrea");

        Persona P3 = new Persona ("00000000", "afg");
        P3.setEdat(20);

        Persona P4 = new Persona ("0000002");
        P4.setNom("FGH");
        P4.setEdat(19);

        Persona P5 = new Persona ("0000004", 21);
        P5.setNom("WQ");

        Persona P6 = new Persona (25);
        P6.setNom("AY");
        P6.setDni("0000005");

        Persona P7 = new Persona (25, "NM");
        P7.setDni("000004");

        P1.visualitzar();
        P2.visualitzar();
        P3.visualitzar();
        P4.visualitzar();
        P5.visualitzar();
        P6.visualitzar();
        P7.visualitzar();
    }

}


