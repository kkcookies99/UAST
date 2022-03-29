 class Solution {
    public int XXX(int[] height) {
        if(height.length <= 1) return -1;
        int low = 0, high = height.length - 1, v_max = 0;

        while(low<high){
            int h = Math.min(height[low], height[high]);
            v_max = Math.max(v_max, (high-low)*h);
            if(height[low] < height[high]) low++;
            else high--;
        }
        return v_max;
    }
}

