 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int index = m-- + --n;
        while(n >= 0){
            nums1[index--] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
};

