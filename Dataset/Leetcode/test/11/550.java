 class Solution {
    public int XXX(int[] height) {
        int max = 0,short_side = 0,save_water=0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                short_side = height[i]<height[j]?height[i]:height[j];
                save_water = short_side*(j-i);
                if(max<save_water)
                    max = save_water;
            }
        }
        return max;
    }
}

