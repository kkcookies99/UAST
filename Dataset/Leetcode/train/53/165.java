class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        for (int i = 0,sum = 0; i < nums.length; i++)
            max = (sum = sum < 0 ? nums[i] : sum + nums[i]) > max ? sum : max;
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


