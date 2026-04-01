import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter IP Address : ");
        //to read the line that the user will write
        String ipAddress=input.nextLine();
        //split
        String[] parts=ipAddress.split("\\.");
        //to print each part alone
        for(String part:parts)
        {
            System.out.print(" \n"+part);
        }

    }
}