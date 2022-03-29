class Solution {
    public int XXX(int[] nums) {
        
        int max=nums[0],present_sum=0;
  
        for(int i=0;i<nums.length;i++){
            //若小于零，则取当前值，相当于清零后加当前值
             if(present_sum<0)
                present_sum=nums[i]; 
               //若sum>0则可继续往后加
            else
                 present_sum+=nums[i];
           //每一次均比较max与sum
            max=Math.max(max,present_sum);
        }

        return max;
    }
}


