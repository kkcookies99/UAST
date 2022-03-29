 class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[0] ^= nums[i];
        return nums[0];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


