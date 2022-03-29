class Solution {
    public void XXX(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++){
          int temp=nums[i];
          int j=i-1;
          while(j>=0&&nums[j]>temp){
              nums[j+1]=nums[j];
              j--;
          }
          nums[j+1]=temp;
        }
    }
}

