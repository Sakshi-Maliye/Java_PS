import java.util.*;
class sakzz
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int b=n;
        for(int i=1;i<=b;i++)
        {
	    for(int k=1;k<=i;k++)
{
            System.out.print("*");

            for(int j=(2*n)-2;j>=0;j--)
            {
                System.out.print(" ");
            }
for(int k=1;k<=i;k++)
{
            System.out.print("*");
}
 System.out.println();
            n--;
        }
    }
}