 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int i, j;
    int num = 0, num2;
    int * arrayReturn = NULL;
    for(i=0; i<numsSize-1; i++) {
        for(j=i+1; j<numsSize; j++) {
            if(nums[i]+nums[j] == target) {
                arrayReturn = (int *) realloc(arrayReturn, sizeof(int)*(2+num));
                num2 = 2*num;
                arrayReturn[num2] = i; 
                arrayReturn[num2+1] = j;
                *returnSize = num2+2;
                num++;
            }   
        }
    }
    return arrayReturn;
}

