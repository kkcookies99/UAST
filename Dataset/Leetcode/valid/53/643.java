 class Solution {
    public int XXX(int[] nums) {
        int maxValue =nums[0];
       for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
            sum+=nums[j];
           if(sum>maxValue){
               maxValue=sum;
           }
           }
       }
       return maxValue;
    }
}

