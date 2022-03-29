 class Solution {
    public int XXX(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while (r>l){
            if (height[l] == height[r]){
                max =  Math.max((r - l) * height[l], max);
                r--;                                    //考虑内部是不是有更高的垂线
                l++;                                    //考虑内部是不是有更高的垂线
            }
            else if (height[l]>height[r]){
                if ((r - l) * height[r]>max)
                    max = (r - l) * height[r];
                r--;
            } else {
                if ((r - l) * height[l]>max)
                    max = (r - l) * height[l];
                l++;
            }
        }
        return max;
    }
}

