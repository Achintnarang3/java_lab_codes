package lab2;
import java.util.*;

public class prime {
      
    public static  int  isprime(int k)
    {    
        int cnt=0;
         for(int i=1;i*i<=k;i++)
         {
             if(k%i==0)
             {
                 cnt++;


                 if(i!=k/i)
                 cnt++;

                 
             }
         }

         if(cnt==2)
         return 1;
        else 
        return 0;

    }
    public static void main(String args[])
    {

        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        

         int i=2;
         int cnt=0;

         while(cnt<n)
         {
             if(isprime(i)==1)
             {
                 System.out.println(i);
                 cnt++;
             }
             i++;
         }

        s.close();



    }
    
}