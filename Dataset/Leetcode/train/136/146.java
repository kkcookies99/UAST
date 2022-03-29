 class Solution {
    public int singleNumber(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++) {
            sum^=nums[i];
        }
        return sum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


