 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        auto it1 = nums1.begin()+m;
        auto it2 = nums2.begin();
       for(; it1 != nums1.end(); ){
            *it1 = *it2;
            it1++;
            it2++;
       }
        sort(nums1.begin(), nums1.end());
    }
};

