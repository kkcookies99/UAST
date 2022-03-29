 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int total_size = nums1.size()+nums2.size();
        vector<int> merged(total_size);
        merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),merged.begin());
        if(total_size%2)
            return merged[total_size/2];
        else
            return (double)(merged[total_size/2]+merged[total_size/2-1])/2;
    }
};

