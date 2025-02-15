public class roundsum {
    public static void main(String[] args) {
    
    int [] arr = {10,-20,-2,2,-20,-10};
    int k=2;
    int count = getSumCount(arr,k);
    System.out.println(count);
    }
    public static int getSumCount(int arr[], int k)
    {
        int count=0;
        for (int i =0;i<arr.length;i++)
    {
        int sum = 0;
        for (int j=i;j<arr.length;j++)
        {
            if (sum == k )
            {
                count++;
            }
            else
            {
                sum=sum+arr[j];
            }
        }
    }
        return count;

    }
}
