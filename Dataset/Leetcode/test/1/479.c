 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int i , j;
    returnSize = NULL;
    for( i = 0; i < numsSize - 1; i++ ){
        for(  j = i + 1 ; j < numsSize; j++ ){
            if( nums[i] + nums[j] == target ){
                returnSize = ( int* )malloc( sizeof ( int ) * 2 );
                returnSize[0] = i;
                returnSize[1] = j;
                return returnSize;
            }
        }
    }
    return returnSize;
}

