 class Solution {
    public void XXX(int[] nums) {
        //三路归并方法
        int zero=-1,two=nums.length;
        for(int i=0;i<two;){
            if(nums[i]==1){
                i++;
            }else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[--two];
                nums[two]=temp;
            }else {
                int temp=nums[i];
                nums[i++]=nums[++zero];
                nums[zero]=temp;
            }
        }
    }
}

