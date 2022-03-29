 public int[] XXX(int[] nums, int target) {
    int count = 0;
    while(count<nums.length){
        for(int i=count+1;i<nums.length;i++){
            if(target == nums[count] + nums[i])
                return new int []{count,i};
        }
        count++;
    }
    return null;
}
