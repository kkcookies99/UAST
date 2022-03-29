 class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        //Arrays.sort(nums);
        boolean[] temp=new boolean[n+1];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i!=j && nums[i]==nums[j]){
                    temp[i]=true;
                    //continue;
                }
            }
            if(temp[i]==false) return nums[i];
        }
    return 0;
}
}

