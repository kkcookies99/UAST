 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len = nums1.size() + nums2.size();
        /*奇数情况*/
        int k1 = (len + 1)/2;
        int mid1 = findKth(nums1, 0, nums2, 0, k1);
        if (len % 2) return mid1;
        /*偶数情况，需要找到中间2个数取平均*/
        int k2 = (len + 2)/2;
        int mid2 = findKth(nums1, 0, nums2, 0, k2);
        return (mid1 + mid2) / 2.0;
    }

    /*查找第K个小的数*/
    int findKth(vector<int>& nums1, int left1, vector<int>& nums2, int left2, int k)
    {
        /*数组为空情况，直接返回另一个有序数组的第K值*/
        if (left1 >= nums1.size()) return nums2[left2 + k -1];
        if (left2 >= nums2.size()) return nums1[left1 + k -1];
        /*K==1，返回2个数组第1个元素的小值*/
        if (k == 1) return min(nums1[left1], nums2[left2]);
        /*比较第K/2小的值，如果越界，则取MAX_INT，保证不会被排除*/
        int v1 = left1 + k/2 - 1 < nums1.size() ? nums1[left1 + k/2 -1] : INT32_MAX;
        int v2 = left2 + k/2 - 1 < nums2.size() ? nums2[left2 + k/2 -1] : INT32_MAX;
        /*排除较小的第K/2值所在数组的左边值,减K值为K-k/2*/
        if (v1 < v2) return findKth(nums1, left1 + k/2, nums2, left2, k - k/2);
        return findKth(nums1, left1, nums2, left2 + k/2, k - k/2);
    }
};

