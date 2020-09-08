
package lab3;
import java.util.*;

public class index {

    public static void main(String args[])
    {   
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
       int []arr=new int[n]; 

       for(int i=0;i<n;i++)
       arr[i]=s.nextInt();

       int []prefix=new int[n];
       int []suffix=new int[n];
       
       prefix[0]=arr[0];
       suffix[n-1]=arr[n-1];

       for(int i=1;i<n;i++)
       prefix[i]=prefix[i-1]+arr[i];
       for(int i=n-2;i>=0;i--)
       suffix[i]=suffix[i+1]+arr[i];

    int ch=1;
       for(int i=0;i<n;i++)
       {
           int a=(i-1>=0?prefix[i-1]:0);
           int b=(i+1<n?suffix[i+1]:0);
           if(a==b)
           {
               System.out.println(i);
               ch=0;
               break;
           }
       }
       if(ch==1)
       {
        System.out.println("No index");

       }
       s.close();
     
       
    }
    
}