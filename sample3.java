import java.util.*;
class sample3
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter m:");
        int m=s.nextInt();
        System.out.println("Enter n:");
        int n=s.nextInt();
        int[][] a=new int[m][n];
        System.out.println("Enter array elemnts:");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=s.nextInt();
        System.out.println("Enter key:");
        int key=s.nextInt();
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==key)
                   {
                       flag=1;
                    break;
                   }
            }
        }
        if(flag==1)
        System.out.println("true");
        else
        System.out.println("false");
        
    }
}