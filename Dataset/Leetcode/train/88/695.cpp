 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        auto it = nums2.begin();
        for(int i = 0; i < nums1.size(); i++) if(nums1[i] == 0 && it != nums2.end()) nums1[i] = *it++;
        sort(nums1.begin(), nums1.end());
    }
};

