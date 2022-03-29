 class Solution {
    public int[] XXX(int[] nums, int target) {
        int res[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}

