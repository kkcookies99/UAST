 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // 思路：从两个数组尾部开始比较，大值之间进行比较
        int tail = nums1.size()-1;  // m是有效长度，nums1.size()是实际长度
        while (n > 0) {  // 需要将nums2全部转移过来才结束
            if (m == 0 || nums1[m-1] < nums2[n-1]) {
                n--;
                nums1[tail] = nums2[n];
            } else {
                m--;
                nums1[tail] = nums1[m];
            }
            tail--;
        }
    }
};

