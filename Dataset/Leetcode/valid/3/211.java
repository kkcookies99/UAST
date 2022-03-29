 class Solution {
    public int XXX(String s) {
        int l=0,res=0;
        boolean []f = new boolean[257];
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(f[(int)c])
            {
                while(s.charAt(l) != c) 
                {
                    f[(int)s.charAt(l)] = false;
                    l++;
                }
                l++;
            }
            f[(int)c] = true;
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}

