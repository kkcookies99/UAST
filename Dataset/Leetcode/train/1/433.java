 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] index = new int[2];

        int lengths=nums.length;
        for(int i =0;i<lengths-1;i++){
            index[0]=i;
                for(int j=i+1;j<lengths;j++){
                    if(nums[j] == target-nums[i]){
                        index[1]=j;
                        return index;
                    }
                }

        }
        return index;
    }
}

