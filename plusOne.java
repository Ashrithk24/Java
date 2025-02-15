import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOne {

    public static void main(String[] args) {

        int [] digits = {9,9,9};
        System.out.println(Arrays.toString(digits));
        System.out.println (Arrays.toString(plusone(digits)));

        
    }
static int [] plusone(int [] digts)
{
    int n = digts.length;
    for (int i = n-1;i >=0 ;i--)
    {
        if(digts[i]<9)
        {
            digts[i]++;
            return digts;

        }
        digts[i]=0; 
    }
    int [] newNumber = new int[n+1];
    newNumber[0]=1;
    return newNumber;

}


}

