 class Solution {
    public int XXX(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        // 特殊情况
        if (nums[low] > target) return low;
        if (nums[high] < target) return high+1;
        // 二分法
        while (low < high){     // 找到大于等于target的最小下标。
            int mid = (low+((high-low)>>1));
            if (nums[mid] < target) low = mid+1;
            else high = mid;
        }
        return low;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


