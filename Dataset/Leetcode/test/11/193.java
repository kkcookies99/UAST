class Solution {
    public int XXX(int[] height) {
     int left=0;       //左指针
     int right=height.length-1;  //右指针
     int ans=0;    //记录面积也就是容积
     while(left<right){   // 双指针循环条件
         int min=Math.min(height[left],height[right])*(right-left);    // 容积取决于短板
         if(height[left]<height[right])   //if-else  是移动短板，哪边短移动那边，短板可能随着移动变短变长
                  { left++;}            
           else{
                   right--;
                }    
          ans=Math.max(min,ans);   //取最大的那个值           
}
  return ans;   //返回能容下的最大容积   
    }
}

