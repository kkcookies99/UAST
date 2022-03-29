 class Solution {
    public int XXX(int[] height) {
        int n = height.length;
        if(n < 2) return 0;
        int i = 0, j = n-1;
        int v = 0;
        while(i < j){
            int hi = height[i], hj = height[j];
            v = Math.max(v,Math.min(hi,hj)*(j-i));
            if(hi < hj) while(i < n && hi >= height[i]) i++;
            else while(j >= 0 && hj >= height[j]) j--;
        }
        return v;
    }
}

