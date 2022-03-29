class Solution {
    public void XXX(int[] nums) {
        if(nums == null || nums.length <= 1)return;
        int b = 0;
        int w = 0;
        for(int i=0;i<nums.length;++i){
            if(nums[i] == 2){
                b += 2;
            } else if(nums[i] == 1){
                w += 1;
            }
            nums[i] = 0;
        }
        for(int i=nums.length-1;i>=0;--i){
            if(b!=0){
                b-=2;
                nums[i] = 2; 
            }else if(w!=0){
                w-=1;
                nums[i] = 1;
            }else{
                break;
            }
        }
    }
}

