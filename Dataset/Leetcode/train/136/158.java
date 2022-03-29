 class Solution {
    public int singleNumber(int[] nums) {
        int k=nums[0];
        for(int i=1;i<nums.length;i++)
            k^=nums[i];
        return k;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


