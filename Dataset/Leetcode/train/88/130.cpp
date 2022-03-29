 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int num = m+n-1;
        m--;
        n--;
        while (num >= 0) {
            if (m >= 0 && n >= 0) {
                if (nums1[m] > nums2[n]) {
                    nums1[num] = nums1[m];
                    m--;
                } else {
                    nums1[num] = nums2[n];
                    n--;
                }
            } else if (n >= 0) {
                nums1[num] = nums2[n];
                n--;
            } else { // 只剩下nums1，直接返回
                break;
            }
            num--;
        }
    }
};

