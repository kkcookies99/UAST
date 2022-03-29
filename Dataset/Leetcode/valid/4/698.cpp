 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) 
    {
        int nums_all = nums1.size() + nums2.size();
        int nums_1 = nums1.size();
        int nums_2 = nums2.size();
        int *middle = NULL;
        int *bef = NULL;
        int *nums1temp = nums1.size() > 0 ? &nums1[0] : NULL;
        int *nums2temp = nums2.size() > 0 ? &nums2[0] : NULL;
        int *nums1temp2 = nums1temp;
        int *nums2temp2 = nums2temp;


        while( nums1temp && nums2temp && ( nums1temp - nums1temp2) + ( nums2temp - nums2temp2) <= nums_all / 2 && nums1temp < nums1temp2 + nums_1 && nums2temp < nums2temp2 + nums_2)
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


        while( nums1temp && ( nums1temp - nums1temp2) + ( nums2temp ? ( nums2temp - nums2temp2) : 0) <= nums_all / 2 && nums1temp < nums1temp2 + nums_1)
        {
            bef = middle;
            middle = nums1temp;
            nums1temp++;
        }


        while( nums2temp && ( nums2temp - nums2temp2) + ( nums1temp ? ( nums1temp - nums1temp2) : 0) <= nums_all / 2 && nums2temp < nums2temp2 + nums_2)
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

