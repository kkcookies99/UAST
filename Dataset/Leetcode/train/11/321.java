class Solution {
    public int XXX(int[] height) {
            int l=0 ,r=height.length-1 , maxCapacity=0;
            while(l<=r){
                int min=Math.min(height[l],height[r]);
                int count=min*(r-l);                            
                if(maxCapacity<count) maxCapacity=count;
                if(height[l]<height[r]) l++;
                else  r--;
            }
            return maxCapacity;
    }
}

