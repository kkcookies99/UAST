 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();        
        int m1 = (l1 + l2 - 1) / 2;
        int m2 = (l1 + l2) / 2;
        int n1 = 0;
        int n2 = 0;
        int a,b;
        for (int i = 0; i <= m2; i++) {
            b = a;
            if (n2 >= l2 || (n1 < l1 && nums1[n1] <= nums2[n2])) {
                a = nums1[n1];
                n1++;
                continue;
            }
            a = nums2[n2];
            n2++;

        }
        if (m1 == m2) {
            return a;
        }
        return (a + b)/2.0;
    }
};

