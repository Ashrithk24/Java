//problem - 205


import java.util.HashMap;

class isMorphic
{
public static void main (String [] args)
{
String s = "rkr";
String t = "iti";
System.out.println(isomorphic(s,t));
}
public static boolean isomorphic(String s, String t)
{
HashMap<Character, Character> hm = new HashMap <>();
for (int i = 0 ; i< s.length(); i++)
{
 if (hm.containsKey(s.charAt(i)))
 {
    if (!(hm.get(s.charAt(i))).equals(t.charAt(i)))
    {
         return false;
    }
}
    else
    {
        if (hm.containsValue(t.charAt(i)))
        {
            return false;
        }
        hm.put(s.charAt(i), t.charAt(i));
 
    }
 
}
return true;
}
}
