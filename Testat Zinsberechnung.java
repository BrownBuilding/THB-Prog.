import java.util.Scanner;
public class test {
    public static void main (String args []) {
        // Scanner bereitstellen
        Scanner sc = new Scanner(System.in);
        //Variable deklarieren
        //Float falls das Kapital ist eine Zahl mit Komma
        float Kn,K0;
        int n,i;
        //Fragen nach den Eingaben
        System.out.println("Bitte geben Sie das Anfangskapital ein");
        K0 = sc.nextFloat();
        System.out.println("Bitte geben Sie die Laufzeit in Jahren ein");
        n = sc.nextInt();
        System.out.println("Bitte geben Sie den Zinssatz ein");
        i = sc.nextInt();
      
        if(i<10){
                    //Endkapital rechnen und zeigen
                     Kn = K0+K0*n*i/100;
                     System.out.println("Ihr Endkaptial ist "+Kn);
                     
        }else{
            System.out.println("Eingabefehler");
            
            
        }
    }
}
