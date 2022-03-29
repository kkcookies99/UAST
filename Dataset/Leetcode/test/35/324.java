 public int XXX(int[] nums, int target) {
    int start =0,end =nums.length-1;
    return search(start,end,nums,target);
}
 public int search(int start , int end ,int[] nums,int target){
    //记录中间值
    int middle=(start+end)/2;
    //中间值跟目标值比较      
    if (nums[middle]<target){
        //最后一位直接返回最后的位置
        if (middle == nums.length-1) return nums.length;
        //中间部分比较
        if (nums[middle+1]>=target) return middle+1;
            else return search(middle+1,end,nums,target);
    }else if (nums[middle]>target){
        //最前一位直接返回最前的位置
        if (middle == 0) return middle;
        //中间部分比较
        if (nums[middle-1]<target) return middle;
        else if(nums[middle-1]==target) return middle-1;
        else return search(start,middle-1,nums,target);
    }
    return middle;
}
