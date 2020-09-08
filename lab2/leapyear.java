package lab2;
import java.util.*;

 

public class leapyear {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
            
        int year=s.nextInt();


        if(year%100==0&&year%400==0)
        {
             
            System.out.println("Its Leap year");
            

        }
        else if(year%4==0&&year%100!=0)
        {
            System.out.println("Its Leap year");

        }
        else
        System.out.println("Not Leap Year");

        s.close();

    }
    
}