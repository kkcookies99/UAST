int XXX(int* nums, int numsSize){
int max = nums[0];
if(numsSize == 0){
    return 0;
}
for(int i = 0;i < numsSize;i++){
    int sum = 0;  
    for(int j = i;j < numsSize;j++){
        sum = sum + nums[j]; //累加之和
        if(sum > max){
            max = sum;
        }
    }  
}
return max;
}

