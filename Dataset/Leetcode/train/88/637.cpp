 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int tail = m + n -1; // 数组一末尾
        int n1 = m - 1, n2 = n - 1;
        for (int t = 0; t < m+n; t++){ // 条件不能都是-1 那时候已经完了 不能再进去了
            if (n1 == -1){ // 数组一完了
                nums1[tail--] = nums2[n2--];
            }else if (n2 == -1){
                nums1[tail--] = nums1[n1--];
            }else if (nums1[n1] > nums2[n2]){
                nums1[tail--] = nums1[n1--];
            }else {
                nums1[tail--] = nums2[n2--];
            }
        }
    }
};

