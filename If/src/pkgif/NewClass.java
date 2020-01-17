import java.util.Scanner;

    class NewClass {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            figurr c= new figurr(0);
            System.out.println("rektangel eller cirkel?");
         String a = s.nextLine();
         if(a.equals("rektangel")) {
             System.out.println("omkrets eller area?");
             String b = s.nextLine();
             if(b.equals("omkrets")) {
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.rektangelOmkrets());
             } else if(b.equals("area")) {
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.rektangelArea());
             }
         } else if(a.equals("cirkel")) {
             System.out.println("omkrets eller area?");
             String b = s.nextLine();
             if(b.equals("omkrets")) {
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.cirkelOmkrets());
             } else if(b.equals("area")) {
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.cirkelArea());
             }
         }
        }
    }
 class figurr {
        private final double pi= 3.14;
        private double length;
        Scanner s = new Scanner(System.in);
        
        figurr(double length) {
            System.out.println("vilken längd? ");
        this.length = s.nextInt();
        }

    public double getLength() {
        return length;
    }

    public void setLengt(double length) {
        this.length = length;
    }
   

    double cirkelArea() {
        double cirkelArea = length * length * pi;
        return cirkelArea;
    }
 
    double cirkelOmkrets() {
        double cirkelOmkrets = length * pi;
        return cirkelOmkrets;
    }
    
    double rektangelArea() {
        double rektangelArea = length * length;
        return rektangelArea;
    }
    
    double rektangelOmkrets() {
        double rektangelOmkrets = length * 4;
        return rektangelOmkrets;
    }
        }

