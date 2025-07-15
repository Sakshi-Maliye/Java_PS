import java.util.*;
class sample4
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int[] a = new int[n];
        int[] max = new int[n];
        System.out.println("Enter prices");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int min=a[0];
        int j=0,temp=0,diff=0,m=0;
        for(int i=0;i<n;i++)
         {   
            if(a[i]<min)
             {
                 min=a[i];
                 j=i;
             }
         }
        for(int i=j;i<n;i++)
        {
            temp=diff;
            diff=a[i]-min;
            if(diff>temp)
                m=diff;
        }
        System.out.println("profit="+m);
    }
}