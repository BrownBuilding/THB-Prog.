import java.util.Scanner;
// Scanner brauchen wir um etwas in der Konsole einzugeben

public class Test {
    
    public static void main (String [] args){
    
        final int x = Integer.MAX_VALUE;
        // final = konstante Variable

        Scanner sc =  new Scanner(System.in);
        // Scanner mit "sc" aufrufen
        System.out.println("Gib mal zwei Zahlen ein");

        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        if (y>=10 && y<=2000000000 && z>=10 && z<=2000000000){
            // y und z müssen >=10 und <= 2000000000 sein
            if ((y*z)<x || (y*z)<=x){
                int m = y*z;
                System.out.println(m);
            } else {
                System.out.println("Zahlen zu gross");
                // wenn die Zahlen zu groß sind -> Multiplikation > Integer.Max_Value -> Überlauf
            }
        } else {
            System.out.println("Eine Zahl liegt nicht im Wertebereich");
            // wenn eine oder beide Zahlen sind nicht in dem Wertebereich 1-2000000000
        }
        
    }

}
