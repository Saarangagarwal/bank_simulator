/*
 * Create your account, add or withdrawl money from it, check your account, admin space and
 * get much more in return with the one and only AVEDA NATIONAL BANK
 *
 * PLEASE NOTE: THIS FILE WAS RECOVERED FROM AN OLD LAPTOP. AS A RESULT, THERE MIGHT BE INDENTATION ISSUES AND SOME MISSING CONTENT. THANKS FOR UNDERSTANDING!
 *
 * @author (Saarang Agarwal)
 */




import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Account
{

  String Name,Password;

  int AccNo,Money;


  int dd,mm,yy;

  public Account(String n,int an,int d,int m,int y,int mon,String p)

  {


    Name=n;

    AccNo=an;

    dd=d;

    mm=m;

    yy=y;
    
    Money=mon;

    Password=p;

  }




  public void displayData()




  {




    System.out.println(AccNo+"\t"+Name+"\t\t"+dd+"/"+mm+"/"+yy+"\t"+Money+"\t\t"+Password);




  }




}





public class Bank




{




  static String IMG_PATH="C:\\Users\\agarw\\Downloads\\saarang.png";




  public static Calendar c=Calendar.getInstance();




  public static int date=c.get(Calendar.DATE);




  public static int month=c.get(Calendar.MONTH);




  public static int year=c.get(Calendar.YEAR);




  public static InputStreamReader isr=new InputStreamReader(System.in);




  public static BufferedReader x=new BufferedReader(isr);




  public static int Ano=696200;




  public static Account Acc[]=new Account[696299];





  public static void main() throws IOException




  {




    JFrame frame=new JFrame();




    BufferedImage img = ImageIO.read(new File(IMG_PATH));




    ImageIcon icon = new ImageIcon(img);




    JLabel label = new JLabel(icon);




    frame.add(label); 




    frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );




    frame.setVisible(true);




    int ch=1;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please press enter to start banking with Aveda National Bank ");
    String xyz = sc.nextLine();
    
    System.out.println(" Connecting to-  www.avedanationalbank.ca ");
    System.out.println(".................Please wait..............");
           try {





            Thread.sleep(5000);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }
    System.out.println("\n\nAveda National Bank logged in......");




    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");




    //get current date time with Date()




    Date date = new Date();




    System.out.println(dateFormat.format(date));





    //get current date time with Calendar()




    Calendar cal = Calendar.getInstance();
    
    try {





            Thread.sleep(3030);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }
   
    System.out.println("\n Welcome to Aveda National Bank  ");
    
    try {





            Thread.sleep(2017);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




    startAccount();




    do




    {




        System.out.println("   --: OPTION MENU :--    ");




        try {




            Thread.sleep(1599);




        }




        catch (InterruptedException ex)




        {




            // do nothing




        }




        System.out.println("   1. Create Account      ");




              try {




            Thread.sleep(500);
            
        }
        catch (InterruptedException ex)
        {
            
            // do nothing
            
        }




      System.out.println("   2. Withdrawl           ");




              try {




            Thread.sleep(500);




        }




        catch (InterruptedException ex)




        {




            // do nothing
            
        }




      System.out.println("   3. deposit           ");




              try {
                  
            Thread.sleep(500);




        }




        catch (InterruptedException ex)




        {




            // do nothing




        }




      System.out.println("   4. Check your Account    ");




              try {




            Thread.sleep(500);




        }
        catch (InterruptedException ex)




        {




            // do nothing




        }




      System.out.println("   5. Checking Master     ");




              try {




            Thread.sleep(500);
            
        }
        
        catch (InterruptedException ex)
        
        {




            // do nothing




        }




      System.out.println("   6. Exit                ");




        try {




            Thread.sleep(1599);




        }




        catch (InterruptedException ex)




        {




            // do nothing




        }











      System.out.print(  "Enter Your Choice(1-6) : ");




      
      ch=Integer.parseInt(x.readLine());




      switch(ch)




      {




        case 1: createAccount(); break;




        case 2: withdrawl(); break;




        case 3: deposit(); break;




        case 4: checkAccount(); break;




        case 5: checkMaster(); break;




        case 6: {




                    System.out.println("Hope you enjoyed banking with us");




                     try {




            Thread.sleep(2000);
            
        }




        catch (InterruptedException ex)




        {




            // do nothing




        }




            System.out.println('\u000c');




            System.out.println("Hope you enjoyed banking with us");




            System.out.println("Please do visit us again");




                    break;




                }




        default:




        {




            System.out.println("Invalid input");




             try {




            Thread.sleep(1699);




        }




        catch (InterruptedException ex)




        {




            // do nothing
            
        }




            System.out.println('\u000c');




            main();




        }




               




      }




    }while(ch<=5);




  }




  private static void createAccount() throws IOException




  {




    Calendar c=Calendar.getInstance();




    int date=c.get(Calendar.DATE);




    int month=c.get(Calendar.MONTH);




    int year=c.get(Calendar.YEAR);




    String n,p;




    int m;




    System.out.println("Welcome to Aveda National Bank");




   




     try {










            Thread.sleep(1000);





        }










       catch (InterruptedException ex)




        {




            // do nothing




        }




       




    System.out.println("Your Account Number is : "+Ano);




   




     try {





            Thread.sleep(1000);





        }





        catch (InterruptedException ex)





        {




            // do nothing




        }




        




    System.out.println("Caution: Enter the correct information to get appropriate results and to prevent the program from crashing");




    




    System.out.print("Your Name : ");




    n=x.readLine();




    System.out.print("Opening Balance : ");




    m=Integer.parseInt(x.readLine());




    System.out.print("Your Password : ");




    p=x.readLine();




    Acc[Ano]=new Account(n,Ano,date,month,year,m,p);




    Ano++;




    System.out.println("Account successfully created!!!!");




   




    try {





            Thread.sleep(2069);





        }





        catch (InterruptedException ex)




        {




            // do nothing




        }




    System.out.print('\u000c');




  }




  private static void withdrawl() throws IOException




  {




    String p;




    int no,amt;




    System.out.println("Caution: Enter the correct account number to get appropriate results and to prevent the program from crashing");




    System.out.print("Your Account Number : ");




    no=Integer.parseInt(x.readLine());




    System.out.print("Password : ");




    p=x.readLine();




    if(no<Ano && p.equals(Acc[no].Password))




    {




      System.out.println("Welcome "+Acc[no].Name);




      System.out.print("Withdrawl Amount : ");











      amt=Integer.parseInt(x.readLine());




      if(amt<=Acc[no].Money)




        {




            Acc[no].Money-=amt;




            System.out.println("Thankyou, Only rs. "+Acc[no].Money+" is left in your Account");




            Scanner sc = new Scanner(System.in);




            System.out.println("Please press enter to continue");




            String xyz = sc.nextLine();




      




        try {





            Thread.sleep(1899);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




        System.out.print('\u000c');




    }




       
        else




        System.out.println("Only rs. "+Acc[no].Money+" left in your Account");




               try {





            Thread.sleep(1000);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




        System.out.print('\u000c');




    }




    else




      System.out.println("Your are an unauthorized Customer");




      try {




            Thread.sleep(1000);




        }




        catch (InterruptedException ex)




         {





            // do nothing




        }




        System.out.print('\u000c');




  }




  private static void deposit() throws IOException




  {




    String p;




    int no,amt;




    System.out.println("Caution: Enter the correct account number to get appropriate results and to prevent the program from crashing");




    System.out.print("Your Account Number : ");




    no=Integer.parseInt(x.readLine());




    System.out.print("Password : ");




    p=x.readLine();




    if(no<Ano && p.equals(Acc[no].Password))




    {




      System.out.println("Welcome "+Acc[no].Name);




      System.out.print("Deposit Amount : ");




      amt=Integer.parseInt(x.readLine());




      Acc[no].Money+=amt;




      System.out.println("Now you have Rs."+Acc[no].Money+" in your Account");




      




      Scanner sc = new Scanner(System.in);




      System.out.println("Please press enter to continue");




      String xyz = sc.nextLine();




      




             try {





            Thread.sleep(1899);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




        System.out.print('\u000c');




      




    }




    else




    {




      System.out.println("Your are an unauthorized Customer");




            try {





            Thread.sleep(2000);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




        System.out.print('\u000c');




    }




  }




  private static void checkAccount() throws IOException




  {




    String p;




    int no,amt;




    




    System.out.println("Caution: Enter the correct account number to get appropriate results and also to prevent the program from crashing");




    System.out.print("Your Account No. : ");




    no=Integer.parseInt(x.readLine());




    System.out.print("Password : ");




    p=x.readLine();




    if(no<Ano && p.equals(Acc[no].Password))




    {




      System.out.println("Welcome "+Acc[no].Name);




      System.out.println("Your Balance Amount : "+Acc[no].Money);




      




      Scanner sc = new Scanner(System.in);




      System.out.println("Please press enter to continue");




      String xyz = sc.nextLine();




      




             try {





            Thread.sleep(1899);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




        System.out.print('\u000c');




    }




    else




      System.out.println("Your are an unauthorized Customer");




  }




  private static void checkMaster()




  {




    System.out.println("Enter authorised password......");




    Scanner sc = new Scanner(System.in);




    int saa = sc.nextInt();




   




    if(saa==6969)




    {




            System.out.println("Access Granted");




            System.out.println("Acc\tName\t\tDate\t\tMoney\t\tPassword");




            for(int i=696200;i<Ano;i++)




            Acc[i].displayData();




            System.out.println("\n\n\n");




            




        }




        else {




            System.out.println("Access Rejected");




                                 try {





            Thread.sleep(2696);




           }
        catch (InterruptedException ex)




           {




            // do nothing




        }




            System.out.println('\u000c');




        }




  }     




  private static void startAccount()




  {




    Acc[Ano]=new Account("Saarang",Ano,date,month,year,10000,"Agarwal");  Ano++;




  }
}
