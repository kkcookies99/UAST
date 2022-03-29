 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.empty() && nums2.empty())
            return 0.0;
        vector<int> resvec;
        int len1 = nums1.size();
        int len2 = nums2.size();

        int i = 0;
        int j = 0;

        while (i < len1 && j < len2)
        {
            if (nums1[i] < nums2[j])
                resvec.push_back(nums1[i++]);
            else
                resvec.push_back(nums2[j++]);
        }
        while (i < len1)
        {
            resvec.push_back(nums1[i++]);
        }
        while (j < len2)
        {
            resvec.push_back(nums2[j++]);
        }

        int len3 = resvec.size();
        if (!(len3 % 2))
        {
            return (double)(resvec[len3/2] + resvec[len3/2 - 1]) / 2.0;
        }
        else
        {
            return (double)resvec[len3/2];
        }

    }
};

