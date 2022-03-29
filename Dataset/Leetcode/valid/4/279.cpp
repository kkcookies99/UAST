 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        for(int i = 0;i<nums2.size();i++)
        {
            nums1.push_back(nums2[i]);
        }
        sort(nums1.begin(),nums1.end());
        double midmum = 0.0;
        int size = nums1.size();
        if(size == 0)
        {
            return {};
        }
        else if(size == 1)
        {
            return nums1[0];
        }
        int index = 0;
        if(nums1.size()%2 == 0)
        {
            index = size/2;
            midmum = (nums1[index] + nums1[index-1]) / 2.0;
        }
        else
        {
            index = (size - 1) / 2;
            midmum = nums1[index];
        }
        return midmum;
    }
};

