 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) 
    {
        int nums_all = nums1.size() + nums2.size();
        int *middle = NULL;
        int *bef = NULL;
        int *nums1temp = nums1.size() > 0 ? &nums1[0] : NULL;
        int *nums2temp = nums2.size() > 0 ? &nums2[0] : NULL;


        while( nums1temp && nums2temp && ( nums1temp - &nums1[0]) + ( nums2temp - &nums2[0]) <= nums_all / 2 && nums1temp < &nums1[0] + nums1.size() && nums2temp < &nums2[0] + nums2.size())
        {
            bef = middle;
            if( *nums1temp <= *nums2temp)
            {
                middle = nums1temp;
                nums1temp++;
            }
            else
            {
                middle = nums2temp;
                nums2temp++;
            }
        }


        while( nums1temp && ( nums1temp - &nums1[0]) + ( nums2temp ? ( nums2temp - &nums2[0]) : 0) <= nums_all / 2 && nums1temp < &nums1[0] + nums1.size())
        {
            bef = middle;
            middle = nums1temp;
            nums1temp++;
        }


        while( nums2temp && ( nums2temp - &nums2[0]) + ( nums1temp ? ( nums1temp - &nums1[0]) : 0) <= nums_all / 2 && nums2temp < &nums2[0] + nums2.size())
        {
            bef = middle;
            middle = nums2temp;
            nums2temp++;
        }


        if( nums_all % 2 == 0)
        {
            return double( *bef + *middle) / double(2);
        }
        else
        {
            return double( *middle);
        }
    }
};

