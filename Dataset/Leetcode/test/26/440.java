 class Solution {
    public int XXX(int[] nums) {
        int arryLength = nums.length;
        int pointer1 = 0;
        int pointer2 = 0;
        if(arryLength==0){
            return 0;
        }
        for(int i =0;i<arryLength;i++){
            if(i==0){
                pointer2++;
            }else{
                 if(nums[i]!=nums[pointer1]){
                      nums[pointer2]=  nums[i];
                       pointer2++;
                       pointer1++;
                 }   
            }
        }
        return pointer1+1;
    }
}

