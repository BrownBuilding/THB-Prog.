import java.util.Scanner;

public class test {
    public static void main (String [] args){
        
    
    final double euro = 1;
    final double usd = 1.3364;
    final double chf = 1.2131;
    final double gbp = 0.8013;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Yo, wie viel Euro?");
    double eurobetrag = sc.nextDouble();
    
    System.out.println("okay, in welche Währung willst umrechnen? (USD, CHF, EUR oder GBP?)");
    String WaehrungEingabe = sc.next();
    
    if(eurobetrag>0 && eurobetrag<=1000){
        double ausgabe;
        switch(WaehrungEingabe){
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
