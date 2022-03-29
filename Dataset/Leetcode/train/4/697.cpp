 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        int len = m + n;
        double ans = 0;
        int i=0, j=0;
        vector <int> nums;

        if (m == 0) 
            nums = nums2;
        else if (n == 0) 
            nums = nums1;
        else {
            while (i<m || j<n) {

                if (i<m && (j==n || nums1[i]<nums2[j])) {
                    nums.push_back(nums1[i]);
                    i++;
                }
                else {
                    nums.push_back(nums2[j]);
                    j++;
                }

            }
        }

        
        if (len % 2) {
            len = len / 2;
            ans = nums[len];
        }
        else {
            len = len / 2;
            ans = nums[len-1] + nums[len];
            ans = ans / 2.0;
        }

        return ans;
    }
};

