 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> nums3;
        int i = 0;int j = 0;
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j]){
                nums3.push_back(nums1[i]);i++;
            }
            else{
                nums3.push_back(nums2[j]);j++;
            }
        }
        while(i < m)
        {
            nums3.push_back(nums1[i]);i++;
        }
        while(j < n)
        {
            nums3.push_back(nums2[j]);j++;
        }
        nums1 = nums3;
    }
};

