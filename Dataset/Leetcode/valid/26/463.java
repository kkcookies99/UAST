 class Solution {
    public int XXX(int[] nums) {
        int res  =0;
        int j = 0;
        for(int i =0 ;i < nums.length;i++){
            if(i==0||nums[i]!=nums[j-1]){
                nums[j++] =nums[i];
              res++;  
            }
        }
        return res;

    }
}

