 class Solution {
    public int XXX(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        int index = -1;

        if (target <= nums[low])
        {
            index = 0;
        }
        else if (target > nums[high])
        {
            index = nums.length;
        }
        else
        {
            while (low != high)
            {
                int mid = (low + high) / 2;

                if (mid == low | mid == high)
                {
                    break;
                }

                if (nums[mid] > target)
                {
                    high = mid;
                }
                else if (nums[mid] < target)
                {
                    low = mid;
                }
                else
                {
                    index = mid;
                    break;
                }
            }
        }

        if (index == -1)
        {
            index = low + 1;
        }

        return index;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


