public class zeit {

    int sekunde;
    int minute;
    int stunde;

    public boolean setZeit(int stunde, int minute, int sekunde) {
        this.stunde = stunde;
        this.minute = minute;
        this.sekunde = sekunde;

        boolean korrekt = false;

        if (-1 < stunde && -1 < minute && minute < 61 && -1 < sekunde && sekunde < 61) {
            korrekt = true;
            toString();
            inSekunden();
        }else{
            System.out.println("Eingabefehler");
        }

        return korrekt;
    }

    public String toString() {

        String format = "Stunde: " + this.stunde + " Minute: " + this.minute + " Sekunde: " + this.sekunde;
        System.out.println(format);
        return format;
    }

    public long inSekunden() {
        long inSekunden = (this.stunde * 3600) + (60 * this.minute) + this.sekunde;
        System.out.println("Ziet in Sekunden: "+inSekunden+" s");
        return inSekunden;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class testdriver {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        zeit zeit = new zeit();
        System.out.println("gib die Zahl der Stunden an:");
        int stunden = sc.nextInt();
        System.out.println("gib die Zahl der Minuten an:");
        int minuten = sc.nextInt();
        System.out.println("gib die Zahl der Sekunden an:");
        int sekunden = sc.nextInt();

        zeit.setZeit(stunden, minuten, sekunden);


    }

}
