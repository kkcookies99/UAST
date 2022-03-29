class Solution {
    public int XXX(int[] height) {
        if (height.length<2 || height.length>30000){
            throw new RuntimeException("Length of height array exceed.");
        }
        int left=0;
        int right=height.length-1;
        int mArea=0;
        while(left<right){
            int l=right-left;
            int h=height[left]>height[right]?height[right--]:height[left++];
            int area=h*l;
            if (area>mArea){
                mArea=area;
            }
        }
        return mArea;
    }
}

