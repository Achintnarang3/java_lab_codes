package lab3;
import java.util.*;

public class functionoverloading {

public static double area(int radius)
{
    return 3.14*radius*radius;

}

public static double area(double height,double base)
{
    return 0.5*height*base;
}

public static int area(int length,int width)
{
    return length*width;
}



    public static void main(String args[])
    {

      Scanner s=new Scanner(System.in);
      System.out.print("Enter radius:");
      double radius =s.nextDouble();
      System.out.println(area((int)radius));
      System.out.print("Enter Height and Base:");
      double height =s.nextDouble();
      double base =s.nextDouble();
      System.out.println(area(height,base));
      System.out.print("Enter Length and Width:");
       height =s.nextDouble();
       base =s.nextDouble();
       System.out.println(area((int)height,(int)base));

    s.close();







    }
    
}