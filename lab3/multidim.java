package lab3;
 

public class multidim {

    public static void main(String args[])
    {
        int[][] arr=new int[3][3];

        arr[0][0]=32;
        arr[1][0]=500;
        arr[1][1]=300;
        arr[2][0]=(int)39.45;
        arr[2][1]=600;


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();

        }

    }
    
    
}