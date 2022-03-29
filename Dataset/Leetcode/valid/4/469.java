 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int middleLen = length / 2;
        if (length % 2 == 1) {
            return getKthElement(nums1, nums2, middleLen + 1);
        } else {
            return (getKthElement(nums1, nums2, middleLen) + getKthElement(nums1, nums2, middleLen + 1)) / 2;
        }
    }

    private double getKthElement(int[] nums1, int[] nums2, int k) {
        if (isEmpty(nums1) && isEmpty(nums2)) {
            return 0;
        }
        if (isEmpty(nums1)) {
            return nums2[k - 1];
        }
        if (isEmpty(nums2)) {
            return nums1[k - 1];
        }
        int[] nums = nums1, auxiliaryNums = nums2;
        if (nums1[0] > nums2[0]) {
            nums = nums2;
            auxiliaryNums = nums1;
        }

        return binarySearch(nums, auxiliaryNums, 0, nums.length - 1, k);
    }

    private double binarySearch(int[] nums,
                                int[] auxiliaryNums,
                                int begin,
                                int end,
                                int k) {
        if (begin == end) {
            int auxiliaryIndex = k - begin - 2;
            return auxiliaryIndex < 0 ? nums[begin] : Math.max(nums[begin], auxiliaryNums[auxiliaryIndex]);
        }

        int mid = (begin + end) / 2;
        int auxiliaryIndex = k - mid - 2;
        if (auxiliaryIndex < 0) {
            return binarySearch(nums, auxiliaryNums, begin, mid, k);
        }

        if (auxiliaryIndex >= auxiliaryNums.length) {
            return binarySearch(nums, auxiliaryNums, mid + 1, end, k);
        }

        if (auxiliaryIndex == auxiliaryNums.length - 1) {
            if (auxiliaryNums[auxiliaryIndex] <= nums[mid + 1]) {
                return Math.max(nums[mid], auxiliaryNums[auxiliaryIndex]);
            }
            return binarySearch(nums, auxiliaryNums, mid + 1, end, k);
        }

        if (nums[mid] <= auxiliaryNums[auxiliaryIndex + 1] && auxiliaryNums[auxiliaryIndex] <= nums[mid + 1]) {
            return Math.max(nums[mid], auxiliaryNums[auxiliaryIndex]);
        }

        if (nums[mid] > auxiliaryNums[auxiliaryIndex + 1]) {
            return binarySearch(nums, auxiliaryNums, begin, mid, k);
        }

        return binarySearch(nums, auxiliaryNums, mid + 1, end, k);
    }

    private boolean isEmpty(int[] arr) {
        return null == arr || 0 == arr.length;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

