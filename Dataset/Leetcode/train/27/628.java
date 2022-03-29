 class Solution {
    public int XXX(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int temp;
        while(j < nums.length){
            if(nums[i] != val){
                i++;
                j++;
            }else{
                if(nums[j] == val){
                    j++;
                }else{
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
          
        }
        return i;
    }
}

