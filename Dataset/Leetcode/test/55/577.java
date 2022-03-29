 class Solution {
    public boolean XXX(int[] nums) {
        int last = nums.length - 1;

        for (int i=nums.length - 1; i>=0; i--) {
            if (nums[i] + i >= last) last = i;
        }
        return last == 0;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


