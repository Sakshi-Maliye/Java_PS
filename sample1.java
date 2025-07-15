import java.util.*;
class sample1
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int[] a= new int[n];
        int flag=0;
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter target:");
        int target=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(flag==1)
                break;
            for(int j=0;j<n;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println(i+" "+j);
                    flag=1;
                    break;
                }
            }
        }
    }
}