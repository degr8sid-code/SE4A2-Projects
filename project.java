import java.util.Scanner;

public class project
{
    int[]     pins=new int[99];
    String[]  usernames=new String[99];
    String[]  fullnames=new String[99];
    float[]   balance=new float[99];
    int       counter=0,id=0;

    Scanner box1 =new Scanner(System.in);
    Scanner box2 =new Scanner(System.in);

    void login()
    {
        String tempusername;
        int temppin;
        System.out.println("\t\t**Login Portal**");
        System.out.print("Enter username :");
        tempusername=box1.nextLine();
        System.out.print("Enter pin      :");
        temppin=box2.nextInt();
        for (int i=0;i<99;i++)
        {

            if(tempusername.equals(usernames[i]) && temppin==pins[i])
            {
                System.out.println("Access Permitted");
                id=i;
                System.out.println("\t***********************");
                transaction();

            }
        }

            System.out.print("Access Denied");
            System.out.println("\t***********************");


        menu();

    }

    void signup()
    {
        System.out.println("\t\t**Signup Portal**");
       System.out.print("Enter Fullname     : ");
       fullnames[counter]=box1.nextLine();
       System.out.print("Enter Username     : ");
        usernames[counter]=box1.nextLine();
       System.out.print("Enter pin 4-digits : ");
        pins[counter]=box2.nextInt();
       System.out.print("Enter Balance      : ");
        balance[counter]=box2.nextFloat();
        counter++;
        menu();
    }

    void transaction()
    {
        int choice;
        float tempbalance,transmoney;
        System.out.println("\t\t**Transaction Portal**");
        System.out.println("\t\t[1] Debit\t\t[2] Credit\t\t[3] View Balance\t\t[4] Exit");
        System.out.println();
        System.out.print("Enter choice :");
        choice =box2.nextInt();
        if(choice==1)
        {
            System.out.print("How much do you want to deposit ? ");
            transmoney=box2.nextFloat();
            if(balance[id]>transmoney)
            {
                balance[id]-=transmoney;
                System.out.println(balance[id]);
                transaction();
            }
            else
            {
                System.out.println("Not enough Balance in account");
                transaction();

            }


        }
        else if(choice==2)
        {
            System.out.print("How much do you want to Credit ? ");
            transmoney=box2.nextFloat();
            balance[id]+=transmoney;
            System.out.println("Your avaliable Balacnce :"+balance[id]);

            transaction();

        }
        else if(choice==3)
        {
            System.out.println("Your avaliable Balacnce :"+balance[id]);
            transaction();
        }
        else if(choice==4)
        {
            menu();
        }
        else
        {
            System.out.println("Try Again !");
            transaction();

        }

    }


    void menu()
    {

        int choice;
        Scanner box2 =new Scanner(System.in);
        System.out.println("\t\t\t***Mini Bank Prototype***");

        System.out.println("\t\t[1] Login\t\t[2] Signup\t\t[3] Transaction\t\t[4] Exit");
        System.out.println();
        System.out.print("Enter choice :");
        choice =box2.nextInt();
        if(choice==1)
        {
            login();
        }
        else if(choice==2)
        {
            signup();
        }
        else if(choice==3)
        {
            transaction();
        }
        else if(choice==4)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Out of serice,come late");
        }
    }
    public static void main(String[] args)
    {
        project p=new project();
        p.menu();


    }



}
