 class Solution {
    public void XXX(int[] nums) {
        int length = nums.length;
        int pre = 0;
        int last = length-1;
        int i = 0;
        while (i <= last) {
            if (nums[i] == 0) {
                if (i == pre) {
                    i++;
                    continue;
                }
                nums[i] = nums[pre];
                nums[pre] = 0;
                pre++;
                continue;
            }
            if (nums[i] == 2) {
                nums[i] = nums[last];
                nums[last] = 2;
                last--;
                continue;
            }
            i++;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


