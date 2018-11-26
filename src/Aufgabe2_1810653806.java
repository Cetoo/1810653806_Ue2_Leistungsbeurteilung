import javax.swing.*;


public class Aufgabe2_1810653806 {

    public static void main(String[] args) {

        int Zahl1= Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl1"));
        int Zahl2= Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl2"));

        if (Zahl1 == Zahl2)
        {
            System.out.println("Die Zahlen sind identisch " + Zahl1 + " = Zahl2");
        }
        else
        {
            System.out.println("_________");
            System.out.println("Eingegebener Wert Zahl 1 =" + Zahl1);
            System.out.println("Eingegebener Wert Zahl 2 =" + Zahl2);
            System.out.println("_________");
        }

        for (int i=1; ; i++)
        {
            if (Zahl1 < Zahl2)
            {
                Zahl1++;
                System.out.println("Die Zahl 1 wurde um 1 erhöht: " + Zahl1);
            }else
            {
                Zahl2++;
                System.out.println("Die Zahl 2 wurde um 1 erhöht: " +Zahl2);
            }
            if (Zahl1 == Zahl2)
            {
                System.out.println("Die Schleife musste " + i + "mal laufen bis die Zahlen gleich waren");
                break;
            }
        }

    }
}
