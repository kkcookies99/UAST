class Solution {
    public void XXX(int[] nums) {
        //分组排序，思路就是0靠前，2靠后，中间剩下的为1.
        //Arrays.sort(nums) ;
        int left = 0,end = nums.length-1 ;
        for(int i=0;i<=end;i++){
            if(nums[i]==0){
                swap(nums,left,i) ;
                left++ ;
            }else if(nums[i]==2){
                swap(nums,end,i) ;
                end-- ;
                //如果说换出来的元素不为1的话要回退指针
                if(nums[i]!=1) i-- ;
            }
        }

    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i] ;
        nums[i] =nums[j] ;
        nums[j] = temp ;
    }
}

