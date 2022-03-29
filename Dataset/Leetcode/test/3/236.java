 class Solution {
    public int XXX(String s) {
        int l = 0;
        int r = -1;
        int res = 0;
        int[] freq = new int[256];
        
        while( l < s.length() ){
            if( r+1 < s.length() && freq[s.charAt(r+1)] == 0){
                r++;
                freq[s.charAt(r)] ++;
            }
            else{
                freq[s.charAt(l)] --;
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}

