import java.util.Scanner;
/**
 *This program calculates if the users number is even or odd
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates new Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter an integer:");

    //This is the number the user inputs
    int usersNumber = input.nextInt();

    //divides users number by 2 and also remainder
    int dividedNumber = (usersNumber % 2);
  

    //Checks to see if number is even or odd
    if(dividedNumber >= 1){
      System.out.println(usersNumber + " is an odd number");
    } else {
      System.out.println(usersNumber + " is an even number");
    }
    
    
  }
}
