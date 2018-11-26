

import javax.swing.*;

public class Aufgabe5_1810653806
{


    public static void main(String[] args)
    {
        forSchleife(5);
        forSchleife(10);
        whileSchleife(16);
        whileSchleife(20);
        nutzerSchleife();

    }

    static void forSchleife(int a)
    {
        for (int i = 0; i <= a; i++)
        {
            System.out.println("Ausgabe = " + i);
        }
    }

    static void whileSchleife(int a )
    {
        int i = 0;

        while(i <= a) /*Sagt an wie oft meine While Schleife laufen soll*/
        {
            System.out.println(i);
            i+=2;
            /*Hier erhöht sich mein Wert immer um jeweils 2*/
        }
    }

    static void nutzerSchleife()
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben"));
        int k = 0;

        for(int i= 0; i < a; i++)
        {
            for(int j = 0; j < b;j++)
            {
                k++;
                System.out.println("Das ist der" + k + ". durchlauf");
            }
        }
    }
}
