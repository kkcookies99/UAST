 class Solution {
    public int XXX(int[] nums, int val) {
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        int count = 0;
        for(int i= 0;i< len;i++){
            if(nums[i] == val){
                count++;
            }
        }
        int i = 0;
        int j = len-1;
        while(i < j){
            if(nums[j] == val){
                j--;
            }
            if(nums[i] != val){
                i++;
            }else if(nums[i]==val && nums[j] != val){
                swap(nums,i,j);
                i++;
                j--;
            }
        }
        return len-count;
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

