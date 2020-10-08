import java.util.*;
public class TransitCalculator {

    int daysTransit;
    int expectedRides;

    public TransitCalculator(int myDays, int myExpectedRides){
      
        daysTransit = myDays;
        expectedRides = myExpectedRides;
    }

    public void perRideComparison(){
        System.out.println("\n"+"Pay-per-each-ride: " + perRideSingle());
        System.out.println("Buying unlimited 7 days rides: " + perRide7days());
        System.out.println("Buying unlimited 30 days rides: " + perRide30days());
    }
    
    public double perRideSingle(){
        double PrizeSingleRide = 2.75;
        return PrizeSingleRide;}
    public double perRide7days(){
        double Prize7days = 33;
        int d = daysTransit/7 + 1;
        if(daysTransit % 7 == 0){d--;}
        double perRide = d * Prize7days / expectedRides;
        return Math.round(perRide*100) / 100.0;
    }
    public double perRide30days(){
        double Prize30days = 127;
        int d = daysTransit/30 + 1;
        if(daysTransit % 30 == 0){d--;}
        double perRide = (d * Prize30days) / expectedRides;
      return Math.round(perRide*100) / 100.0;
    }
    
    public void bestChoice(){
     double best = Math.min(perRideSingle(), Math.min( perRide7days(), perRide30days()));
        if( best == perRideSingle()){System.out.println("You should buy single tickets.");}
      else if (best == perRide7days()){System.out.println("You should buy get 7-days unlimited option.");}
        else {System.out.println("You should buy get 30-days unlimited option.");}
    }  
  
public static void main(String[] args) {
  Scanner what = new Scanner(System.in);
  System.out.println("Type numbers days of using NYC transit.");
 int userDays = what.nextInt();
  
  System.out.println("Ok, now type how many ride do you expext to do.");
  int userRide = what.nextInt();
        TransitCalculator myOne = new TransitCalculator(userDays, userRide);
        myOne.perRideComparison();
        myOne.bestChoice();

    }
}