import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height:");
        int h=s.nextInt();
        System.out.println("Enter x:");
        int x=s.nextInt();
        System.out.println("Enter y:");
        int y=s.nextInt();
        int c=0,p=0;
        while(true)
        {
            p=p+x;
            c++;
            if(p>=h)
                break;
            p=p-y;
            
        }
        System.out.println("days="+c);
    }
}
