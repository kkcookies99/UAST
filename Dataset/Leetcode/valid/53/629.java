 class Solution {
    public int XXX(int[] nums) {
        int i =1;
        int sum =0;
        int maxsum= -999999;        
        if(nums.length == 1){
            return nums[0];
        }
        while(i <= nums.length){
            for(int j =0; j< nums.length-i+1; j++){
                int m =j;
                int csum = 0;
                for(int k =0; k<i; k++){
                    csum += nums[j];
                    j++;
                }
                sum = csum;
                j = m;
                if(maxsum <= sum){
                    maxsum = sum;
                }               
            }
            i++;
        }
        return maxsum;
    }
}

