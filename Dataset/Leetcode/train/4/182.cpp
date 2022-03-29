 class Solution {
private:

    int findKth(vector<int>& nums1, int i, vector<int>& nums2, int j, int k) {
        if (i >= nums1.size())  return nums2[j + k - 1];         //一个数组所有数字被淘汰（淘汰意味着第k个数一定不在这些数字中）返回第二个数组的第k个数，下标 - 1
        if (j >= nums2.size())  return nums1[i + k - 1];
        if (k == 1) return min(nums1[i], nums2[j]);              //返回第1个数，只需要比较现存两数组的首个元素就好
        int midVal1 = (i + k / 2 - 1 < nums1.size()) ? nums1[i + k / 2 - 1] : INT_MAX; //如果该数组存在第k / 2的数，就取它，不存在就设置为最大整数
        int midVal2 = (j + k / 2 - 1 < nums2.size()) ? nums2[j + k / 2 - 1] : INT_MAX;
        if (midVal1 < midVal2) {
            return findKth(nums1, i + k / 2, nums2, j,         k - k / 2);
        } else {
            return findKth(nums1, i,         nums2, j + k / 2, k - k / 2);
        }
    }

public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size(), n = nums2.size();
        int l = (m + n + 1) / 2, r = (m + n + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, l) + findKth(nums1, 0, nums2, 0, r)) / 2.0;
    }
};

