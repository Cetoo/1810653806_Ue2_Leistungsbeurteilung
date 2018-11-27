import javax.swing.*;


public class Aufgabe2_1810653806 {

    public static void main(String[] args) {

        int Zahl1= Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl1"));
        int Zahl2= Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl2"));

        /*Hier lege ich fest das der Nutzer ein Eingabefeld bekommt worin er eine Zahl eingeben kann*/

        if (Zahl1 == Zahl2)
        {
            System.out.println("Die Zahlen sind identisch " + Zahl1 + " = " + Zahl2);

            /*If also wenn die Zahl 1 gleich der Zahl 2 ist soll ausgegeben werden das beide Zahlen indentisch sind*/
        }
        else
        {
            System.out.println("_________");
            System.out.println("Eingegebener Wert Zahl 1 =" + Zahl1);
            System.out.println("Eingegebener Wert Zahl 2 =" + Zahl2);
            System.out.println("_________");

            /*Else die eingegebene Zahl wird in der Konsole noch einmal angezeigt und danach wird die for Schleife angewandt*/

            for (int i=1; ; i++)
                /*For Schleife braucht immer 3 Kommentare: Startwert; Bedingung; Hochzählen der durchläufe++*/
            {
                if (Zahl1 < Zahl2)
                {
                    Zahl1++;
                    System.out.println("Die Zahl 1 wurde um 1 erhöht: " + Zahl1);

                    /*If also wenn die Zahl 1 kleiner Zahl 2 ist soll ausgegeben werden das die Zahl 1 um eins erhöht wurde und das bereits erhöhte Ergebnis angezeigt werden soll*/
                }else
                {
                    Zahl2++;
                    System.out.println("Die Zahl 2 wurde um 1 erhöht: " +Zahl2);

                    /*Ansonsten also falls if nicht in Kraft tritt soll die Zahl 2 jeweils um 1 erhöht werden und ausgegeben werden*/
                }
                if (Zahl1 == Zahl2)
                {
                    System.out.println("Die Zahlen sind jetzt identisch! Die Schleife musste " + i + "x laufen bis die Zahlen gleich waren");
                    break;

                    /*Wenn jedoch die Zahl 1 gleich der Zahl 2 ist wird die Schleife mit einem break abgebrochen und die Anzahl der durchläufe angezeigt*/
                    /*Meine For Schleife muss in der else Schleife sein denn wenn die Zahlen nicht identisch sind läuft die Schleife solange bis
                    * beide Eingabewerte identtisch sind und dafür wird je nach Bedarf Zahl 1 oder Zahl 2 erhöht*/
                }
            }
        }

    }
}
