import javax.swing.*;

public class Aufgabe3_1810653806 {

    public static void main(String[] args) {

        String Eingabe = JOptionPane.showInputDialog("Bitte geben Sie etwas ein: ");
        /*Es soll ein Eingabefeld erscheinen für den Nutzer mit dem Befehl bitte geben sie etwas ein:*/

        double alter = Double.parseDouble(Eingabe);
        int zahl = Integer.parseInt(Eingabe);
        boolean abfrage = Boolean.parseBoolean(Eingabe);
        long langezahl = Long.parseLong(Eingabe);
        char buchstabe = Eingabe.charAt(0);
        byte bit = Byte.parseByte(Eingabe);
        short kurz = Short.parseShort(Eingabe);
        float f = Float.parseFloat(Eingabe);
        /*Hier Deklariere und Initialisiere ich meine Werte in welche die Eingabe vom Nutzer umgewandelt werden soll*/

        System.out.println(alter);
        System.out.println(zahl);
        System.out.println(abfrage);
        System.out.println(langezahl);
        System.out.println(buchstabe);
        System.out.println(bit);
        System.out.println(kurz);
        System.out.println(f);

        /*double gibt meinen Eingabewert in einer Kommazahl aus*/
        /*int gibt meinen Eingabewert als ganze Zahl aus*/
        /*boolean gibt meinen Eingabewert mit true oder false aus*/
        /*long gibt mir auch eine ganze Zahl aus aber hätte Platz für längere Zahlen*/
        /*Bei char Eingabe eines Buchstaben bricht mein Programm ab*/
        /*byte gibt mir meine Eingabe in einen ganze Zahl aus*/
        /*short gibt mir meinen Eingabewert auch als ganze Zahl aus*/
        /*Float gibt mir meinen Eingabewert als Kommazahl aus*/

        String neu = String.valueOf(alter);
        System.out.println("Wert von neu " + neu);

        /*String neu gibt mir meinen Wert erneut aus mit Wert von neu und der Eingabe aber nur von dem Datentyp double weil(alter) die Bezeichnung meines Datentyps double ist*/

        /*Das System prüft die Eingabe des Nutzers und wandelt diese falls möglich in den enstprechenden zuvor festgelegten Wert um*/
        /*Das System bricht automatisch ab wenn ein Buchstabe eingegeben wird da dies in der ersten Umwandlung bei double nicht möglich ist*/
    }
}
