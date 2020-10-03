import java.lang.Math;

public class Magic8 {

  // declaring the random instance, use static to "save" the value when using in main
  static int rand= (int)(Math.random() * 8);

  public static void main(String[] args) {
    
    // run the code in main and print out the randomly decided fortune-telling
    switch(rand) {
      
      case 0:
      System.out.println("1");
      break;
      case 1:
      System.out.println("2");
      break;
      case 2:
      System.out.println("3");
      break;
      case 3:
      System.out.println("4");
      break;
      case 4:
      System.out.println("5|");
      break;
      case 5:
      System.out.println("6");
      break;
      default: 
      System.out.println("Something went wrong");
      break;
    }
  }
}