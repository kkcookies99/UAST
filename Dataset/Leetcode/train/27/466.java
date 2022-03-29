 class Solution {
    public int XXX(int[] nums, int val) {
       int len=nums.length;
       int temp;
       int index=0;
       while(index<len){
           if (val==nums[index]){
               len--;
               temp=nums[index];
               nums[index]=nums[len];
               nums[len]=temp;
           }else{
               index++;
           }
           
       }
       return len;
    }
}

