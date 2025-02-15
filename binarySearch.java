import java.util.Scanner;

public class binarySearch {
    
    public static void main(String[] args) {
        
        int i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("enter array element");
        for (i = 0; i < n; i++)
        {
            array[i]=in.nextInt();
        }
        System.out.println("Enter the element to search");
        int search = in.nextInt();
        int first = 0;
        int last = n;
        int middle = (first+last)/2;
        while(first<=last)
        {
            if (array[middle]<search)
            {
                first=middle+1;
            }
            else if (array[middle] == search)
            {
                System.out.println("found at location"+(middle+1));
            }
            else
            {
                
                last=middle-1;
                middle=(first+last)/2;
            }
            if (first > last)
            {
                System.out.println("Not found");
            }

        }
       

    }
}
