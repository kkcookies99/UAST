 class Solution {
    public int XXX(String s) {

        boolean[] used = new boolean[128];
        char[] ss = s.toCharArray();
        int l = 0;
        int r  = 0;
        int max = 0;
        while(r < ss.length){
            if (!used[ss[r]]){
                used[ss[r]] = true;
                r ++;
                max = Math.max(max, r-l);
            } else{
                used[ss[l]] = false;
                l++;
            }
        }
        return max;
    }
}

