 int singleNumber(int* nums, int numsSize){
    int i, ans;

    if (numsSize == 1) {
        return nums[0];
    }

    ans = nums[0];
    for (i = 1; i < numsSize; i++) {
        ans ^= nums[i];
    }
    return ans;
}

