import java.util.Scanner;
public class test {
    public static void main (String args []) {
        // Scanner bereitstellen
        Scanner sc = new Scanner(System.in);
        //Variable deklarieren
        //Float falls das Kapital ist eine Zahl mit Komma
        float K0, n, p, Kn, i;
        //Fragen nach den Eingaben
        System.out.println("Bitte geben Sie das Anfangskapital ein");
        K0 = sc.nextFloat();
        System.out.println("Bitte geben Sie die Laufzeit in Jahren ein");
        n = sc.nextFloat();
        System.out.println("Bitte geben Sie den Zinssatz ein");
        p = sc.nextFloat();
        //Zinssatz rechnen und als Dezimal angeben
        i = (p*n)/100;
        // Teilaufgabe 5.1 If Anweisung
        if(i<0.1){
                    //Endkapital rechnen und zeigen
                     Kn = K0+(K0*n*i);
                     System.out.println("Ihr Endkaptial ist "+Kn);
                     //Keine Eingabe mehr
        }else{
            System.out.println("Eingabefehler");
            //Keine Eingabe mehr
            
        }
    }
}
