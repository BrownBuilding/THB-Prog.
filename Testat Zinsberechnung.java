//Danke an Hanna

import java.util.Scanner;
public class test {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        float Kn,K0,i;
        int n;
        System.out.println("Bitte geben Sie das Anfangskapital ein");
        K0 = sc.nextFloat();
        System.out.println("Bitte geben Sie die Laufzeit in Jahren ein");
        n = sc.nextInt();
        System.out.println("Bitte geben Sie den Zinssatz ein");
        i = sc.nextFloat();
        if(i<10){
                      Kn = K0+K0*n*i/100;
                     System.out.println("Ihr Endkaptial ist "+Kn);
        }else{
            System.out.println("Eingabefehler");
        }
    }
}
