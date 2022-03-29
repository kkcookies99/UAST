 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        for(int i=0; i<nums1.size()&& n>=1 && m>=1; i++)
        {   
            if(nums2[n-1] > nums1[m-1])
            {
                nums1[nums1.size()-1-i] = nums2[n-1];
                n--;
            }
            else 
                {
                    nums1[nums1.size()-1-i] = nums1[m-1];
                    m--;
                }
        }

    }
};

