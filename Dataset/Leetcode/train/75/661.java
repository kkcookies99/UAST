 class Solution {
    public void XXX(int[] nums) {
        int left=-1;
        int right=nums.length;
        int index=0;
        while(index!=right){
            if(nums[index]<1){
             swap(nums,index++,++left);
            }else if(nums[index]>1){
                swap(nums,index,--right);
            }else{
                ++index;
            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}


