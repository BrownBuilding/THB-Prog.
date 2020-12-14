import java.util.Scanner;
// Scanner brauchen wir um etwas in der Konsole einzugeben

public class test {
    public static void main (String args []){
        
    final String plus = "+";
    final String minus = "-";
    final String multi = "*";
    final String div = "/";
    // final = konstant 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Gib mal zwei Zahlen ein ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    // Eingabe von zwei Zahlen
        
    System.out.println("gib mal ein Zeichen ein");
    String eingabe = sc.next();
    // Eingabe von dem Zeichen
    
    if (x>0 && y>0 && x<=1000 && y<=1000){
        switch (eingabe){
        // Mehrfach Auswahl
            case plus : System.out.println(x+y);
            break;
            case minus : System.out.println(x-y);
            break;
            case multi : System.out.println(x*y);
            break;
            case div : System.out.println(x/y);
            break;
            default: System.out.println("Eingabefehler");
            // Falls nichts zutrifft
        }
    }else{
        System.out.println("Eingabefehler");
    }
        
        
    }

}
