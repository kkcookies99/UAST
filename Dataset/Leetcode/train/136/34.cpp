 int singleNumber(vector<int>& nums) {
       int len = nums.size();
        int result=0;
       for(int i=0;i<len;i++){
           result ^=nums[i];
       } 
        return result;
 }

