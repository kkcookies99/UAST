 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.size()>nums2.size()) return XXX(nums2,nums1);
        for(auto i: nums1)
        {
            nums2.push_back(i);
        }
        int n=nums2.size()/2;
        if(nums2.size()%2!=0)
        {
            nth_element(nums2.begin(),nums2.begin()+n,nums2.end());
            return (double)nums2[n];
        }
        else
        {
            nth_element(nums2.begin(),nums2.begin()+n,nums2.end());
            nth_element(nums2.begin(),nums2.begin()+n-1,nums2.end());
            return (double) (nums2[n]+nums2[n-1])/2;
        }
    }
};

