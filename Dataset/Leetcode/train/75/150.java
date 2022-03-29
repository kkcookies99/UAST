class Solution {
    public void XXX(int[] nums) {
        //记录0的交换位置
        int zero=0;
        //记录2的交换位置
        int two=nums.length-1;
        for(int i=0;i<=two;){
            if(nums[i]==1){
                i++;
            }else if(nums[i]==0){//和前面的交换的时候，i直接递进即可，因为处理过程是从左到右的，左边的肯定是处理过的
                int temp=nums[i];
                nums[i]=nums[zero];
                nums[zero]=temp;
                i++;
                zero++;
            }else{//当和右边的交换的时候，i就得暂时停下来，因为可能交换回来一个2，或者是0，所以要停下来，等下一次循环再去处理
                int temp=nums[i];
                nums[i]=nums[two];
                nums[two]=temp;
                two--;
            }
        }
    }
}

