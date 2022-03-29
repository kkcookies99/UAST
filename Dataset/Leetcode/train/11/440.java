 class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j = height.length-1;
        int now = 0;
        int max = 0;
        while(i<j){
            if(height[i]<=height[j]){
                now = (j-i)*height[i];
                max = Math.max(max,now);
                i++;
            }else{
                now = (j-i)*height[j];
                max = Math.max(max,now);
                j--;
            }
        }
        return max;
    }
}

