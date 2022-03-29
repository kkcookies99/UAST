 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> a;
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size())
        {
            if (nums1[i] <= nums2[j])
                a.push_back(nums1[i++]);
            else
                a.push_back(nums2[j++]);
        }
        while (i < nums1.size()) a.push_back(nums1[i++]);
        while (j < nums2.size()) a.push_back(nums2[j++]);
        
        if (a.size() & 1) return a[a.size() / 2];
        return double((a[a.size() / 2] + a[a.size() / 2 - 1])) / 2;
    }
};

