/*
T.C=>O(N*N)
S.C=>O(N)
*/

class Solution {
    public String longestNiceSubstring(String s) {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                if(isNicest(sub))
                {
                    if(sub.length()>result.length())
                    {
                        result=sub;
                    }
                }
            }
        }
        return result;
    }
    public boolean isNicest(String s)
    {
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                if(set.contains(Character.toLowerCase(s.charAt(i)))==false)
                {
                    return false;
                }
            }
            else
            {
              if(set.contains(Character.toUpperCase(s.charAt(i)))==false)
                {
                    return false;
                }  
            }
        }
        return true;
    }
}

/*
T.C=>O(N)
S.C=>O(N)
*/
  
class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2)
        {
            return "";
        }
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        for (int i=0; i < s.length(); i++) 
        {
if(set.contains(Character.toUpperCase(s.charAt(i)))&&set.contains(Character.toLowerCase(s.charAt(i)))) continue;
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i+1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s; 
    }
}











