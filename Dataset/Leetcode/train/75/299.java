class Solution {
    public void XXX(int[] nums) {
        int l = 0,r = nums.length-1;
        for(int i = 0;i<=r;i++){
            if(nums[i]==0){
                swap(nums,i,l++);
            }else if(nums[i]==2){
                swap(nums,i,r--);
                i--;//防止交换前就是2
            }

        }

    }
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

