class Solution {
    public int XXX(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
        while(i<j){
            int minheight=height[i]<height[j]?height[i++]:height[j--];
            max=Math.max(max,(j-i+1)*minheight);
        }
        return max;
    }
}

