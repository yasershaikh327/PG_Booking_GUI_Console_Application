import java.util.Scanner;
import java.io.*;

public class owner
{
	public static int id=1;
  String fname, lname ,address, state, city, email_id, password, cpass,filename,pgfilename,pgname,desc,location;;
  char gender;
  Integer ph_no,type,price;
  String log_email, log_pass;
  Scanner sc=new Scanner(System.in);

    public void ownerMenu()
    {
        while (true)
        {
            int ch;
            System.out.println("\nChoose the Following Operations");
            System.out.println("1.Register\n");
            System.out.println("2.LOG IN\n");
            System.out.println("3.Main Menu\n");
            ch=sc.nextInt();

            //Switch case to display switch Operations
            switch(ch)
            {
                case 1:
                registration();
                break;

                case 2:
                login();
                break;

                case 3:
                System.out.print("Going back to Main Menu");
                Main.main(null);
                break;
                
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
  
  

  public void registration()
	{
	  	
	  	try 
	  	{
	  		
        System.out.println("Enter the following details to Register Yourself: \n");

        System.out.println("Enter your First Name: ");
		    fname = sc.next();

	      filename = fname;

        //Writing Data into File
	  		BufferedWriter bw = new BufferedWriter(new FileWriter("OwnerRegistered/"+filename));

	  		
		    bw.write("First Name: " +fname);
		
		    System.out.println("\nEnter your Last Name: ");
		    lname = sc.next();
		    bw.write("\nLast Name: "+lname);
		
		    System.out.println("\nEnter your Gender M[Male] OR F[Female]: ");
		    gender = sc.next().charAt(0);
		    bw.write("\nGender: "+gender);
		
		    System.out.println("\nEnter your Phone number: ");
		    ph_no = sc.nextInt();
		    bw.write("\nPhone No: "+ph_no);
		
		    System.out.println("\nEnter your Address: ");
		    address = sc.next();
		    bw.write("\nAddress: "+address);
		
		    System.out.println("\nEnter your State: ");
		    state = sc.next();
		    bw.write("\nState: "+state);
		
		    System.out.println("\nEnter your City: ");
		    city = sc.next();
		     bw.write("\nCity: "+city);
		
		    System.out.println("\nEnter your Email ID: ");
		    email_id = sc.next();
		    log_email = email_id;
		    bw.write("\nEmail ID: \n"+email_id);
		
		    System.out.println("\nEnter Password: ");
		    password = sc.next();
		    bw.write("\nPassword: \n"+password);
		
		    System.out.println("\nConfirm your Password: ");
		    cpass = sc.next();
		    log_pass = password;

        String filename2 = "OwnerRegistered/AllOwners.txt";
		    File file = new File(filename2);
		    FileWriter fr = new FileWriter(file, true);
		    BufferedWriter bwu = new BufferedWriter((fr));
		    
        bwu.write(filename +"\n");

		    
		    bw.close();
		    bwu.close();
		    fr.close();
	  	}
	  	catch (Exception e) 
      {
        System.out.println("File OR Location Not Found!!\n");
      }       
	
		//Check if Passoword and Confirm Password Matches Or Not
		while(!password.equals(cpass))
		{
			System.out.println("Please Re-Enter Confirm Password");
			cpass = sc.next();
		}
	}

    public void display_details()
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("OwnerRegistered/"+filename));
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
    } 

    public void login()
    {
      System.out.println("\n\nLogin Process...");
		 
		  String fname,fn,lname,gender,phno,add,state,city,email,str,em, password,str1,pass;
		
		  try 
		  {
			
        System.out.print("\nEnter Your Registered First Name: ");
		    fn = sc.next();

        filename = fn;

        BufferedReader br = new BufferedReader(new FileReader("OwnerRegistered/"+filename));
		
			  Scanner scan = new Scanner(br);
	
        // To read the data Line by Line from the File
        fname = scan.nextLine();
        lname = scan.nextLine();
        gender = scan.nextLine();
        phno = scan.nextLine();
        add = scan.nextLine();
        state = scan.nextLine();
        city = scan.nextLine();
        str = scan.nextLine();
        em = scan.nextLine();
        str1 = scan.nextLine();
        pass = scan.nextLine();

            
			
        System.out.print("\nEnter Your Email_Id: ");
        email = sc.next();
            
        System.out.print("\nEnter Your Password: ");
        password = sc.next();
		
        while(!email.equals(em))
        {
          System.out.println("\nPlease Re-Enter Your Email ID ");
          email = sc.next();
        }
		
		    while(!password.equals(pass))
		    {
          System.out.println("\nPlease Enter Correct Password ");
          password = sc.next();
		    }
		
		    System.out.print("\n✅✅ LOG IN Successfull 👍\n");
        while(true)
	      {
          int ch;
          System.out.println("\nChoose the Following Operations");
          System.out.println("1.View My Details");
          System.out.println("2.Add pg");
          System.out.println("3.Dispaly my pg");
          System.out.println("4.Logout");
          ch=sc.nextInt();
	
          //Switch case to display switch Operations
          switch(ch)
          {
            case 1:
              display_details();
            break;
              
            case 2:
              addpg();
            break;

            case 3:
              display_pgdetails();
            break;

            case 4:
              Main.main(null);
            break;
              
            default:
              System.out.println("Invalid Choice");
          }
		    }

        // scan.close();
      }
		  catch (Exception e) 
	    {
	      System.out.println("File OR Location Not Found!!\n");
	    }      
	 

    }

		
  public void addpg()
  {
    try
    {
          
      System.out.println("Enter your PG Name: ");
      pgname = sc.next();

      pgfilename = pgname;

      //Writing Data into File
      FileWriter fw = new FileWriter("PGList/"+pgfilename, true);
      BufferedWriter bww = new BufferedWriter(fw);
      PrintWriter bw = new PrintWriter(bww);
						
      // bw.write("\n");
      
      bw.write("ID:\n"+id);
            
      bw.write("\nPG Name: " +pgname);

      System.out.println("\nEnter the PG type: ");

      System.out.println("1.single bedroom to accomodate 1 person ");
      System.out.println("2.double bedroom to accomodate 2 people ");
      System.out.println("3.triple bedroom to accomodate 3 people ");
      System.out.println("4.quad bedroom to accomodate 4 people ");
      System.out.println("5.dormant bedroom to accomodate 5 people ");
      type = sc.nextInt();
      bw.write("\ntype: " +type);

      System.out.println("Enter description: ");
      desc = sc.next();
      bw.write("\ndescription: " +desc);

      System.out.println("Enter the price: ");
      price = sc.nextInt();
      bw.write("\nPrice: " +price);

      System.out.println("Enter location: ");
      location = sc.next();
      bw.write("\nLocation: " +location);
			id++;
      
      bw.write("\n\n");

      bw.close();

      
      String filename2 = "PGList/AllPGs.txt";
		  File file = new File(filename2);
		  FileWriter fr = new FileWriter(file, true);
		  BufferedWriter bwu = new BufferedWriter((fr));

      // Reading from file AllPGs.txt
      BufferedReader br = new BufferedReader(new FileReader("PGList/AllPGs.txt"));
      
      String str;
      int flag = 0;
            
      //To stop duplicates PG Names Inserting into AllPgs.txt
      while((str = br.readLine()) != null)
      {
        if(str.equals(pgname))
        {
          System.out.print("Exist\n");
          br.close();
          flag = 1;
        }
      }

      // Inserting PG Names to keep record of all PG
      if(flag == 0)
      {
        bwu.write(pgfilename +"\n");

        bwu.close();
		    fr.close();
      }
      
    }
    catch (Exception e)
    {
      System.out.println("File OR Location Not Found!!\n");
    }   
  }
  
  public void display_pgdetails()
  {
    try
    {
      String pgname;
      System.out.println("Enter PG NAME: \n");
      pgname = sc.next();

      BufferedReader br = new BufferedReader(new FileReader("PGList/"+pgname));
      String str;
            
      //To Read whole data from the File
      while((str = br.readLine()) != null)
      {
        System.out.println(str);
      }

      br.close();
            
    }
    catch (Exception e) 
    {
      System.out.println("File OR Location Not Found!!\n");
    }       
  } 
  
} 
     
    