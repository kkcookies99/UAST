 int XXX(int* nums, int numsSize){
    int sum = 0;
    int max = INT_MIN;

    for (int i = 0; i < numsSize; i++) {
        if (sum + nums[i] <= nums[i]) {
            sum = nums[i];
        } else {
            sum += nums[i];
        }
        max = max < sum ? sum : max;
    }

    return max;
}

