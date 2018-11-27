public class Aufgabe4_1810653806
{

    public static void main(String[] args)
    {
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println("Der for Schleifenzähler ist: " + i);
        }
        /*Die For Schleife braucht 3 Kommentare einen Anfang, ein Ziel, und das mit zählen oder erhöhen und weiterlaufen*/

        int i = 1;
        while (i <= 10)
        {
            System.out.println("Der while Schleifenzähler ist: " + i++);
        }
        /*Die While Schleife macht genau das selbe wie die For Schleife allerdings muss hierfür im Vorfeld schon hier der int Wert festgelegt werden*/

        int i2 = 1;
        do
        {
            System.out.println("Der Do-while Schleifenzähler ist: " + i2++);
        }while (i2 <= 10);
        /*Auch bei der do while Schleife muss zuvor ein Wert festgelegt werden die Schleife läuft mindestens 1x durch und erst am Ende wird kontrolliert*/


        /*Wichtig ist das ich bei einer for Schleife meinen Wert gleich zu Beginn in meinen () deklarieren und festlegen kann
         * die Reihenfolge ist hierfür Startpukt; Anzahl an durchläufe bzw. mein Ziel; und das mitzählen der Schleife mit ++
          * Bei der While und do while Schleife muss ich meinen Datentyp und Wert vor der Schleife festlegen
           * der unterschied zwischen while und do while ist das die normale while Schleife gleich zu Beginn die Bedingung
           * prüft und je nach dem eventuell abbricht da Sie eine Fußgesteuerte wie die for Schleife ist und bei der
           * do while Schleife heißt es zu Beginn do sprich diese wird mindestens einmal ausgefüht und erst nach dem ersten
           * Durchlauf wird geprüft und dann abgebrochen oder weitergemacht do while ist somit Fußgesteuert.*/
    }
}
