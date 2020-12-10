import java.lang.Math;
import java.util.Scanner;


public class test{
    public static void main (String [] args){
    final double pi = 3.141592653589793;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Gib mal den Radius ein");
    double radius = sc.nextDouble();
    
    if(radius>0){
        System.out.println("Umfang: "+pi*radius*2);
        
    }else{
        System.out.println("Eingabefehler");
    }
    
}
}
