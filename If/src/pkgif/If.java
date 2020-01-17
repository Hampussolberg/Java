package pkgif;

import java.util.Scanner;



public class If {
  public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      double val = 0;
      double hojd = 0;
      double bredd = 0;
      double radie = 0;
      double area = 0;
         do {
             
     System.out.println("Vilket av föjande vill du göra?");
      System.out.println("1. Rektangel");
       System.out.println("2. Cirkel");
        System.out.println("3. Avsluta program");
         val = s.nextInt();
            
          if (val == 1) {
              System.out.println("Vilken höjd?");
              hojd = s.nextInt();
              System.out.println("Vilken bredd?");
              bredd = s.nextInt();
              area = hojd * bredd;
              System.out.println("Arean på rektangeln är " + area);
          }
          else if (val == 2) {
              System.out.println("Vilken radie?");
              radie = s.nextInt();
              area = radie * radie * 3.14;
              System.out.println("Arean på cirkeln är " + area);
              
          }
      } while (val != 3);
         System.out.println("Du avslutade programmet");
     }
}
