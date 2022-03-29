 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] a= {0,0};
        for(int i = 1 ;a[0] < nums.length-1;i++){
            if(nums[i] + nums[a[0]] == target){
                a[1] = i;
                return a;
            }
            if(i >= nums.length-1 ){
                a[0]++;
                i = a[0];
            }
        }
        return null;
    }
}

