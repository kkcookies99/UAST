 class Solution {
    public int XXX(int[] nums, int val) {
        int len = nums.length;
        if (len <= 0) {
            return len;
        }
        int index = 0;
        int p = val;
        for(int i = 0; i < len; i++) {
            if (nums[i] != p) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


