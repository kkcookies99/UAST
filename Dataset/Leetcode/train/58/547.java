class Solution {
    public int XXX(String s) {
        int l = 0;
        int i = 0;
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                l++;
            }
            else if(s.charAt(i)==' '&&l!=0)
            {
                return l;
            }
        }
        return l;
    }
}

