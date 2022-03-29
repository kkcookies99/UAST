int XXX(int* nums, int numsSize){
  int max = nums[0];
  int b = 0;
  for(int i = 0; i < numsSize; i++)
  {
    b += nums[i];
    if(b > max) max = b;
    if(b < 0) b = 0;
  }
  return max;
}

