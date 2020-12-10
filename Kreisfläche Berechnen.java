import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    final double pi = 3.141592653589793;
    Scanner sc = new Scanner(System.in);
    System.out.println("Yo, gib mal den Radius ein");
    double radius = sc.nextDouble();

    if(radius <= 0){
      System.out.println("Eingabefehler");

    }else{
    System.out.println("Flaeche: "+(pi*(radius*radius)));
    }
  }
}
