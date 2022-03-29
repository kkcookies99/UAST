 int XXX(int* nums, int numsSize){
    int i,j,k,Overlap;
    int len=numsSize;
//    numsSize = sizeof(nums)/sizeof(nums[0]);
    for (i = 0; i <numsSize; i++)
    { 
     for (j=i+1; j <numsSize; j++)
     {
      if (nums[i]==nums[j])
      {
          Overlap++;      
      }    
     }
     for (k=i+1; k <numsSize-Overlap; k++)
     {
         nums[k]=nums[k+Overlap];     
     }
     len = len - Overlap; 
     Overlap=0;
    }
  return len;  
}

