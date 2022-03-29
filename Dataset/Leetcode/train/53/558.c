 int XXX(int* nums, int numsSize){
 int flag = 0;//标识max是否有第一次强制更新
 int max=0;
 if(numsSize == 1) return nums[0];
 for(int i = 0; i < numsSize;i ++ )
 {
    int max_numsum = 0;
     for(int j = i; j < numsSize ; j++)
     {
         max_numsum += nums[j];
         if(max_numsum > max || flag == 0)
         {
             max = max_numsum;
             flag = 1;
         }

     }

 }
 return max;
}

