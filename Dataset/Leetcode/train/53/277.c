int XXX(int* nums, int numsSize){
    int temp = nums[0], res = nums[0];
    for (int i = 1; i < numsSize; i++) {
        /*
        temp+nums[i] > nums[i]时，说明temp>0，当然加
        当temp+nums[i] < nums[i]时，说明temp<0，加一个小于0的数无益
        类似贪心算法：
        if (temp < 0) {
              temp = 0;
          }
        temp += nums[i];
         */
        temp = (temp + nums[i]) > nums[i] ? (temp + nums[i]) : nums[i];
        res = res < temp ? temp : res;
    }
    return res;
}

