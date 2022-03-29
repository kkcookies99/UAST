 class Solution {
    public int XXX(int[] nums) {
        
        
    if(nums.length < 2){
                    return nums.length;
                }
                boolean flag = true;

                int i = 0;
                int j = 0;

               for( i = 1; i < nums.length; i++){
                 if(nums[j] != nums[i]){
                     nums[++j] = nums[i];

                 }

               }


               return j + 1;
    }
}

