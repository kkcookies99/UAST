 public int XXX(int[] nums) {

    int m=0;
    int res =0;
    for(int i=0;i<nums.length;i++){
        if((i+1)<nums.length){
            if(nums[i]==nums[i+1]){
            }else{
                nums[res]=nums[i];
                res = res+1;
            }
        }else{
            nums[res]=nums[i];
        }
    }
    return  (res+1);

}

