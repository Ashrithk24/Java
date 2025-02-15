import java.util.Scanner;

class oddEven
{
    public static void main (String [] args)
    {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number");
        n = in.nextInt();
        if ((n/2)*2 == n)
        {
            System.out.println("Even Number"+((n/2)*2));
        
        }
        else
        {
                        System.out.println("Odd Number"+((n/2)*2));


        }

    }
}