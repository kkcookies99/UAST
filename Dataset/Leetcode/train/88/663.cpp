 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n == 0) return;
        if(m == 0 || nums1[m-1] <= nums2[n-1]){
            nums1[m+n-1] = nums2[n-1];
            return XXX(nums1,m,nums2,n-1);
        }else{
            nums1[m+n-1] = nums1[m-1];
            return XXX(nums1,m-1,nums2,n);
        }
    }
};

