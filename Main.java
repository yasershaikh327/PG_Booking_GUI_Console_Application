import java.util.Scanner;

public class Main 
{
  public static void main(String args[]) 
  {
    
    int choice;
    Scanner S = new Scanner(System.in);

    while(true)
    {
      System.out.println("\nChoose From the Following");
      System.out.println("1.Admin Mode");
      System.out.println("2.User Mode");
      System.out.println("3.Owner Mode");
      System.out.println("4.Exit");
      choice = S.nextInt();

      User u1 = new User();
      Admin a1=new Admin();
      owner o1=new owner();

      // Switch case to start the function
      switch (choice) 
      {
        case 1:
          a1.adminMenu();
        break;

        case 2:
          u1.UserMenu();
        break;

        case 3:
          // Owner
          o1.ownerMenu();
        break;

        case 4:
          System.out.print("Thank you For Your Time !!!");
          S.close();
          System.exit(0);
        break;

        default:
          System.out.println("\nInvalid Choice");
      }
    }
    
  }
    
}