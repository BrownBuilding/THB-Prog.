import java.lang.Math;
// Es wurde gefordert die Klasse Math zu importieren
import java.util.Scanner;
// Scanner brauchen wir um etwas in der Konsole einzugeben


public class test{
    public static void main (String [] args){
        
    final double pi = 3.141592653589793;
    // final weil double in unserer Aufgabe konstat sein muss
        
    Scanner sc = new Scanner(System.in);
    // Scanner mit "sc" aufrufen    
     
    System.out.println("Gib mal den Radius ein");
        
    double radius = sc.nextDouble();
    // Radius hat den Wert was der Nutzer in der Konsole eingibt
    
    if(radius>0){
        System.out.println("Umfang: "+pi*radius*2); 
        // wenn Radius größer als 0 ist, dann berechnen wir weiter mit Hilfe des Formels auf Moode und zeigen wir das Ergebnis mit System.out.println
        
    }else{
        System.out.println("Eingabefehler");
        // wenn Radius kleiner als 0 ist, wird nur ein Fehler gezeigt und nichts berechnet
    }
    
}
}
