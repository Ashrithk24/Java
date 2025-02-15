public class searchPrefixWord {

    public static void main(String[] args) {
        
        String scentence = "I love eating burger";
        String searchword = "I";
        System.out.println("word found at:"+searchWordprefix(scentence,searchword));
    }
   public static int searchWordprefix(String scentence , String searchword )
   {
    String [] sentence = scentence.split(" ");
    for (int i = 0; i < scentence.length();i++)
    {
        if (sentence[i].startsWith(searchword))
        {
            return i+1;
        }
    }
    return -1;

   }
}
