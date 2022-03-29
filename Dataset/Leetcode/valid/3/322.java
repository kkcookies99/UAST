 class Solution {
    public int XXX(String s) {
        int l = 0,r  = -1, result = 0;
        int[] t = new int[256];
        char[] chars = s.toCharArray();
        while(r + 1 < chars.length) {
            if( t[chars[r+1]] == 0) t[chars[++r]]++;
            else t[chars[l++]]--;
            result = Math.max(r-l+1,result);
        }
        return result;
    }
}

