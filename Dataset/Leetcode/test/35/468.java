 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<right) {
            int leftright = (right+left)/2;
            int rightleft = leftright + 1;
            if(target<nums[leftright]) {
                right = leftright;
            }
            else if(target==nums[leftright]) {
                return leftright;
            }
            else if(target==nums[rightleft] || target>nums[leftright] && target<nums[leftright]) {
                return rightleft;
            }
            else {
                left = rightleft;
            }           
        }
        return target>nums[right] ? right+1 : right;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


