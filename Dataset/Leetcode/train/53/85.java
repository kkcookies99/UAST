class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int sum = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            sum = Math.max(sum + nums[i], nums[i]);
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


