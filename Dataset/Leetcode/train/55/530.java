 class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        int index = n-1;
        for (int i = n-2; i >= 0; i--) {
            if (nums[i] + i >= index) {
                index = i;
            }
            if(i==0 && index > 0)
            {
                return false;
            }
        }

        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


