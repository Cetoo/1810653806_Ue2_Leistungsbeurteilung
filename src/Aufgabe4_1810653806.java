public class Aufgabe4_1810653806
{

    public static void main(String[] args)
    {
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }
        /*Die For Schleife braucht 3 Kommentare einen Anfang, ein Ziel, und das mit zählen oder erhöhen und weiterlaufen*/

        int i = 1;
        while (i <= 10)
        {
            System.out.println("Der Schleifenzähler ist: " + i++);
        }
        /*Die While Schleife macht genau das selbe wie die For Schleife allerdings muss hierfür im Vorfeld schon hier der int Wert festgelegt werden*/

        int i2 = 1;
        do
        {
            System.out.println("Der Schleifenzähler ist: " + i2++);
        }while (i2 <= 10);
        /*Auch bei der do while Schleife muss zuvor ein Wert festgelegt werden die Schleife läuft mindestens 1x durch und erst am Ende wird kontrolliert*/
    }
}
