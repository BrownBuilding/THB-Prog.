import java.util.Scanner;
// Scanner brauchen wir um etwas in der Konsole einzugeben

public class test {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        // Scanner mit "sc" aufrufen  
        
        System.out.println("Gib mal das Gewicht in Kg ein");
        double gewicht = sc.nextDouble();
        
        System.out.println("Gib mal die Körpergröße in Meter ein");
        double groesse = sc.nextDouble();
        
        if(gewicht>0 && groesse>0){
            double bmi = gewicht/(groesse*groesse);
        if(bmi<=20.0 && groesse>1.75){
            System.out.println("Kandidatin angenommen");
        }else{
            System.out.println("Kandidatin abgelehnt");
        }
        }else{
            System.out.println("Eingabefehler");
        }
    }
}
