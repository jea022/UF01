	import java.util.Scanner;  // Import the Scanner class

class Main { 
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");

    String number = myObj.nextLine();  // Read user input
    System.out.println("Number is: " + number);  // Output user input
  }
}