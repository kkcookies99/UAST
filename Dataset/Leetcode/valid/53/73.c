int XXX(int* nums, int numsSize){
    int max=-2147483647,i=0,sum=0;
    for( i=0; i<numsSize; i++ ){
        if( sum < 0 ) sum = 0;
        sum += nums[i];
        if( sum > max ) max = sum;
    }
    return max;
}

