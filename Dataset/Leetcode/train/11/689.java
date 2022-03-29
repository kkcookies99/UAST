 class Solution {
    public int XXX(int[] height) {
        
        int len = height.length, l = 0, r = len-1;
        int max = 0;
        while(l < r) {
            int vol = (r-l) * Math.min(height[l], height[r]);
            max = Math.max(max, vol);
            if(height[l] < height[r]) ++ l;
            else -- r;
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


