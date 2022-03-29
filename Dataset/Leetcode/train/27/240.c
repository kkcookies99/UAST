 int XXX(int* nums, int numsSize, int val){
    int i,j;
    int len = numsSize;
    int pos = -1;
   
    for(i=0; i<numsSize; i++){
        if(nums[i]==val){
            pos = i;//设置空位
            for(j=pos+1; j<numsSize; j++){
                if(nums[j]!=val){
                    nums[pos] = nums[j];//填补空位
                    pos = j;//设置空位
                }
            }
            --len;
        } 
    }

    return len;
}

