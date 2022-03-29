 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> nums3;
        int k1 = (nums1.size() + nums2.size() + 1) / 2;
        int k2 = (nums1.size() + nums2.size() + 2) / 2;
        int mid1, mid2;
        int sumnum = 0;

        for (int i = 0, j = 0, z = 0; z < (nums1.size() + nums2.size()); z++)
        {

            if (i < nums1.size() && j < nums2.size())
            {
                if (nums1[i] < nums2[j])
                {
                    nums3.push_back(nums1[i]);
                    i++;
                }
                else
                {
                    nums3.push_back(nums2[j]);
                    j++;
                }
            }
            else if (i < nums1.size() && j >= nums2.size())
            {
                nums3.push_back(nums1[i]);
                i++;
            }
            else if (i >= nums1.size() && j < nums2.size())
            {
                nums3.push_back(nums2[j]);
                j++;
            }
            else
            {
                return (double)0;
            }

            sumnum++;
            if (sumnum == k1)
            {
                mid1 = nums3[k1-1];
            }

            if (sumnum == k2)
            {
                mid2 = nums3[k2-1];
                return (double)(mid1 + mid2)/2.0;
            }
        }
        return (double)0;
    }
};

