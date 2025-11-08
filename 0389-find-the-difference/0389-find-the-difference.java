class Solution {
    public char findTheDifference(String s, String t) {
        char a=0;
        for(char i='a';i<='z';i++)
        {
            int c1=0,c2=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==i)
                c1++;
            }
            for(int j=0;j<t.length();j++)
            {
                if(t.charAt(j)==i)
                c2++;
            }
            if(c1!=c2)
            a=i;
        }
        return a;
    }
}