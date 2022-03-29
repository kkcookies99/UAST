 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int i,j;
    int a,b;
    int result;
    returnSize = (int*)malloc(sizeof(int)*3);
    for(i = 0;i < numsSize;i++){
        for(j = i+1; j < numsSize; j++){
            if(*(nums+i) + *(nums+j) == target){
                *(returnSize+0) = i;
                *(returnSize+1) = j;
            }
        }
    }
    return returnSize; 
}


