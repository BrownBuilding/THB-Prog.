import java.util.Scanner;
// Scanner brauchen wir um etwas in der Konsole einzugeben

public class test {
    public static void main (String [] args){
        
    final double euro = 1;
    final double usd = 1.3364;
    final double chf = 1.2131;
    final double gbp = 0.8013;
    
    Scanner sc = new Scanner(System.in);
    // Scanner mit "sc" aufrufen
    
    System.out.println("Yo, wie viel Euro?");
    double eurobetrag = sc.nextDouble();
    
    System.out.println("okay, in welche Währung willst umrechnen? (USD, CHF, EUR oder GBP?)");
    String WaehrungEingabe = sc.next();
    // Es gibt in Java kein nextString(), statt dessen schreibt man nur next();
    
    if(eurobetrag>0 && eurobetrag<=1000){
        double ausgabe;
        // Wir brauchen einen Double zu deklarieren weil wir die Ausgabe unten soll als Doubl ausgegeben
        // Wenn wir z.B nur (eurobetrag * usd) --> kein Double! wie erkennt man das? --> die Ausgabe enthält keine Komma am Ende, also z.B 100 statt 100.0
        
        switch(WaehrungEingabe){
                // Was spielt eine Rolle bei der ausgabe? --> natürlich der Währungeingabe! deswegen wollen wir bestimmen was bei jeder Eingabe gemacht wird
                // In der Aufgabestellung steht dass wir mit Mehrfachauswahl arbeiten müssen, d.h mit Switch-Case
                // Man kann natürlich mit 4 IF Anweisungen das auch machen, wäre aber langweilig
                case "USD":
                ausgabe = usd*eurobetrag;    
                System.out.println(ausgabe+" USD");
                break;
                case "CHF":
                ausgabe = chf*eurobetrag;
                System.out.println(ausgabe+" CHF");
                break;
                case "GBP":
                ausgabe = gbp*eurobetrag;
                System.out.println(ausgabe+" USD");
                break;
                case "EUR":
                ausgabe = euro*eurobetrag;    
                System.out.println(ausgabe+" EUR");
                break;
               
        }
    }else{
        
        System.out.println("Eingabefehler");
    }
    

}
}
