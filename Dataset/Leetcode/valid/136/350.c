 int singleNumber(int* nums, int numsSize){
    int res = 0;
    for (int i = 0; i < numsSize; i++) res ^= nums[i];  //异或运算的特性，a^a=0, a^0=a, (a^b)^c=a^(b^c)
    return res;
}

