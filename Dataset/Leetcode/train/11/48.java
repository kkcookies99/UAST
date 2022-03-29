class Solution {
    public int XXX(int[] height) {
        //双指针解法
        int left=0;
        int right=height.length-1;
        //计算面积
        int XXX=0;
        while(left<right){
            XXX=Math.max(XXX,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return XXX;
    }
}

