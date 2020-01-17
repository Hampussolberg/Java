import java.util.Scanner;


class rak {
       
        Scanner s = new Scanner(System.in);
          private double length;
          
        
      
        rak(double length) {
        
        this.length = s.nextInt();
        
        
        }

    public double getLength() {
        return length;
    }

    public void setLengt(double length) {
        this.length = length;
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

 class figur {
        private final double pi= 3.14;
        Scanner s = new Scanner(System.in);
          private double radie;
          
        
      
        figur(double radie) {
        
        this.radie = s.nextInt();
        
        
        }

    public double getLength() {
        return radie;
    }

    public void setLengt(double length) {
        this.radie = radie;
    }
   

    double cirkelArea() {
        
        double cirkelArea = radie * radie * pi;
        return cirkelArea;
    }
 
    double cirkelOmkrets() {
        double cirkelOmkrets = (radie + radie) * pi;
        return cirkelOmkrets;
    }
    

        }

    class rektangel {
        public static void main(String[] args) {
            figur c= new figur(0);
            rak v= new rak(0);
         
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ v.rektangelOmkrets());
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ v.rektangelArea());
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.cirkelOmkrets());
             System.out.println("Cirkelns area med radien " + c.getLength()+ " är "+ c.cirkelArea());
            
        }
    }
