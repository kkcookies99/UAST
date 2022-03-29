 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=0;i<n;++i){
            int j;
            for(j=m+i;j>0&&nums1[j-1]>nums2[i];--j){
                nums1[j] = nums1[j-1];
            }
            nums1[j] = nums2[i];
        }
    }
};

