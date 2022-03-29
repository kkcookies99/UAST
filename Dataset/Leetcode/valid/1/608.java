 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int result=0;
                result=nums[i]+nums[j];
                if(result==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}

