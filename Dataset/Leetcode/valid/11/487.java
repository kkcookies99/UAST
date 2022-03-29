 class Solution {
    public int XXX(int[] height) {
     int len=0,res=0,left=0,right=height.length-1,lastl=left,lastr=right;
      while(left<right){
          res=Math.max(res,(right-left)*Math.min(height[right],height[left]));
          if(height[left]<height[right]){//双指针规则1，哪个指针小就向中间移动那个
              do{lastl=left;left++;}             
              while(height[left]<=height[lastl]&&left<right); //2,如果新的还不如之前，就直接跳过
          }
          else {
              do{lastr=right;right--;}
                while(height[right]<=height[lastr]&&left<right);
          }
      }
     return res;
    }
} ```

