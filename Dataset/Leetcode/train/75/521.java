 class Solution {
    public void XXX(int[] nums) {
        if (nums==null) return;
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        while (i <= high) {
            if (low < high && nums[low] == 0) {
                low++;
                continue;
            }
            if (high >= 0 && nums[high] == 2) {
                high--;
                continue;
            }
            if (i <= low) {
                i++;
                continue;
            }


            if (nums[i] == 0) {
                nums[i] = nums[low];
                nums[low] = 0;
                low++;
                i++;
                continue;
            }
            if (nums[i] == 2) {
                nums[i] = nums[high];
                nums[high] = 2;
                high--;
                continue;
            } else {
                if (nums[low] == 2) {
                    nums[low] = nums[high];
                    nums[high] = 2;
                }
                i++;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


