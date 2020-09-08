package lab3;
import java.util.*;

public class sort {

    public static void main(String args[])
    {   
        System.out.println("Enter the size:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");

        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();

        Arrays.sort(arr); 

        System.out.printf("Modified arr[] : %s", 
        Arrays.toString(arr)); 

        s.close();
    }
   


    
}