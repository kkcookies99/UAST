 class Solution {
    public int XXX(String s) {
        int[] asc = new int[256];
        int l = 0,r=-1,result = 0;
        while (l < s.length())
        {
            if (r+1 < s.length() && asc[Integer.valueOf(s.charAt(r+1))] == 0)
            {             
                asc[Integer.valueOf(s.charAt(++r))]++;
            }else
            {
                asc[Integer.valueOf(s.charAt(l++))]--;
            }
            result = Math.max(result,r-l+1);
        }
        return result;
    }
}
