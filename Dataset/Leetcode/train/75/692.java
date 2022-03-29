 class Solution {
    public void XXX(int[] nums) {
        int red = 0;
        int blue = nums.length -1;
        for(int i = 0; i <= blue;){
            if(nums[i] == 0){
                nums[i++] = nums[red]; nums[red++] = 0; 
            }else if(nums[i] == 2){
                nums[i] = nums[blue]; nums[blue--] = 2;   
            }else{
                i++;
            }
        }
    }
}

