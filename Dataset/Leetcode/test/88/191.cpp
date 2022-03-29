 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int last = m + n - 1;//确定合并数组的最后一个元素的下标
        while (n) {
            //若nums1数组遍历优先结束，或nums2数组的元素大于nums1的数组元素
            if (m == 0 || nums2[n-1] > nums1[m-1]) {
                //直接将nums2前面的元素填入合并数组中
                nums1[last--] = nums2[--n];
            } 
            //否则将nums1的元素填入合并数组
            else {
                nums1[last--] = nums1[--m];
            }
        }
    }
};

