public int XXX(int[] nums) {
  
 int length = nums.length,max;
    for(int i = 1;i<length;i++) {
        if (nums[i-1] > 0 ) {
            nums[i]+=nums[i-1];
        }
    }
   max = nums[0];
for(int j = 1;j<length;j++){
    if(nums[j] > max){
        max = nums[j];
    }
}
return max;
}

