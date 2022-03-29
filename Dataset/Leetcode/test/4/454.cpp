 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> total(nums1.size()+nums2.size());
        merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),total.begin());
        sort(total.begin(),total.end());
        return total.size()%2==0 ? (total[total.size()/2-1]+total[total.size()/2])/2.0 : total[total.size()/2];
    }
};

