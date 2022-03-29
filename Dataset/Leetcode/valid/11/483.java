 class Solution {
    public int XXX(int[] height) {
        int n=height.length;
        int area=0;
        int left=0;
        int right=n-1;
     while (right>left){
         area=Math.max(area,(right-left)*Math.min(height[left],height[right]));
         if (height[right]<height[left]){
             right--;
         }else {
             left++;
         }
     }
       return area;
    }
}

