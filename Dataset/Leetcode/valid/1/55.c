 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int *a = (int *)malloc(sizeof(int) * 2);
    int i, j;
    for (i = 0; i < numsSize - 1; i++) {
        for (j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                a[0] = i;
                a[1] = j;
                *returnSize = 2;
                return a;
            }
        }
    }               
    *returnSize = 0;
    return a;
}

