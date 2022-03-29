 public int XXX(int[] nums, int val) {
    if (nums.length == 0 ){
        return 0;
    }
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val)
            count++;
    }
    if (count == nums.length){
        return 0;
    }
    //左指针
    int left = 0;
    //右指针
    int right = nums.length-1;

    while (left < right){
        if (nums[right] == val){
            right--;
        }
        if (nums[left] != val){
            left++;
        }

        if (nums[left] == val && nums[right] != val){
            nums[left++] = nums[right--];

        }
    }
    return right+1;
}

