 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = 0, j = 0;
        nums1.erase(nums1.begin() + m, nums1.end());
        while(j < n){
            if(i >= nums1.size()) {
                nums1.insert(nums1.end(), nums2[j++]);
            }else if(nums1[i] > nums2[j]){
                nums1.insert(nums1.begin() + i, nums2[j++]);
            }else{
                i++;
            }
        }  
    }
};

