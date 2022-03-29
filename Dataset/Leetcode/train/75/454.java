 class Solution {
    public void XXX(int[] nums) {
        int len = nums.length;
        if(len<=1){
            return;
        }
        int zero = 0;
        int two = len - 1;
        for (int i = 0; i <= two; i++) {
            if(nums[i]==2){
                swap(nums,i--,two--);
            }else if(nums[i]==0){
                swap(nums,i,zero++);
            }
        }
    }

    private void swap(int[] nums,int x,int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}

