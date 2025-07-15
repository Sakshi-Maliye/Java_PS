import java.util.*;
class sample2
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        if(n<0)
        System.out.println("Not palindrome");
        else
        {
            int b=n,r=0,rev=0;
            while(n!=0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            if(rev==b)
            System.out.println("Palindrome");
            else
            System.out.println("Not palindrome");
        }
    }
}