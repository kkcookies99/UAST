class Solution {
    public void XXX(int[] nums) {
        int p1 = -1, p2 = nums.length;
        for(int i = 0; i < p2; i++){
            if(nums[i] == 0){
                swap(nums, i, ++p1);
            }else if(nums[i] == 2){
                swap(nums, i--, --p2);
            }
        }
    }
    private void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

