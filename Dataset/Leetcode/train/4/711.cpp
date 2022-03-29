 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size(), n2 = nums2.size();
        if (n1 > n2) return XXX(nums2, nums1);
        int k = (n1 + n2 + 1) / 2;
        int l = 0, r = n1;  
        while (l < r) { 
            int m1 = l + r >> 1;
            int m2 = k - m1;
            if (nums1[m1] < nums2[m2 - 1]) l = m1 + 1;
            else r = m1;
        }
        
        int m1 = l, m2 = k - l;
        int c1 = max(m1 <= 0 ? INT_MIN : nums1[m1 - 1],
                     m2 <= 0 ? INT_MIN : nums2[m2 - 1]); 
        int c2 = min(m1 >= n1 ? INT_MAX : nums1[m1],
                     m2 >= n2 ? INT_MAX : nums2[m2]);
        
        if ((n1 + n2) & 1) return c1;
        return (c1 + c2) * 0.5;
    }
};
//二分的代码是挺简单的


