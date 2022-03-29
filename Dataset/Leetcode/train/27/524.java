 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int j=nums.length-1;

         
        for(int i=0;i<=j;i++){
            if(nums[i]==val){
                int temp=nums[i];//交换
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            if(nums[i]==val){
                return i;
            }
        }
        return j+1;
    }
}

