class Solution {
    public int XXX(int[] nums) {
        int preSum = nums[0];
        int maxSum = preSum;
        for (int i = 1; i < nums.length; i++) {
            preSum = preSum + nums[i] > nums[i] ? preSum + nums[i] : nums[i];
            if(maxSum < preSum) maxSum = preSum;
        }
        return maxSum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


