class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        int temp = n - 2;
        if(n == 1){
            return true;
        }
        int pre = n - 1;
        while(temp >= 0){
            if(nums[temp] + temp >= pre){
                pre = temp;
            }
            temp--;
        }
        return pre==0;
    }
}

