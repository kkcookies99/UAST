class Solution {
    public void XXX(int[] nums) {
        int index=0;
        int L = -1;
        int R = nums.length;

        while(index < R){
            if(nums[index]==1){
                index++;
            }else if(nums[index]<1){
                swap(nums,index++,++L);
            }else{
                swap(nums,index,--R);
            }
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}

