
import java.util.Scanner;
import java.io.*;

public class Admin
{
	Scanner sc = new Scanner(System.in);

  public void adminMenu()
  {
    while(true)
    {
      System.out.println("\nChoose the Following Operations : \n1.Log IN\n2.Main Menu\n");
	    int ch=sc.nextInt();

      //switch case for operations
      switch(ch)
      {
        case 1:
          log_in();
        break;

        case 2:
          Main.main(null);
        break;

        default:
        System.out.println("Invalid Choice");
      }
    }
    
  }
	

	public void log_in()
	{
		String user,pass;
		System.out.println("Enter the Admin Username : ");
		user=sc.next();

    while(!user.equals("Admin"))
    {
      System.out.println("\nPlease Enter Your User_id Correctly: \n");
      user=sc.next();
    }

		System.out.println("Enter the Admin Password: ");
		pass=sc.next();

    while(!pass.equals("Admin"))
    {
      System.out.println("\nPlease Enter Your Password Correctly: \n");
      pass=sc.next();
    }

    System.out.print("\nLog In Successfully....\n");
		
		//switches the operation
		System.out.println("\nChoose the Following Operations");
		System.out.println("1.Display All Registered Users : ");
		System.out.println("2.Display All Registered Owner");
		System.out.println("3.Display All PG'S Of Respective Owner");
		System.out.println("4.Display All Bookings");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
        try
	      {
          String filename = "AllUsers.txt";
          BufferedReader br = new BufferedReader(new FileReader(filename));
          String str;

          System.out.print("\n");
            
          //To Read whole data from the File
          while((str = br.readLine()) != null)
          {
            System.out.println(str);
          }
	      
	      }
	      catch (Exception e) 
        {
            System.out.println("File OR Location Not Found!!\n");
        }
			break;

			case 2:
			//display_pgdetails();
			break;

			default:
			System.out.println("Invalid Choice");
		}
	}

}
