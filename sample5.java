import java.util.*;
class sample5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        System.out.println("Enter l:");
        int l=s.nextInt();
        System.out.println("Enter h:");
        int h=s.nextInt();
        int tries=0;
	int flag=0;
        while(l<h)
        {
		if(flag==1)
			break;
            int m=(l+h)/2;
            System.out.println(m);
            System.out.println("My guess is 1.Lower\n2.Higher\n3.You got it right!\n");
            tries++;
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    l=m+1;
                    break;
                case 2:
                    h=m-1;
                    break;
                case 3:
                    System.out.println("In tries="+tries);
					flag=1;
                   	break;
                default:
                System.out.println("no");
            }

		
        }
        
        
    }
}
