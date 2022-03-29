 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> tmp(m, 0);
        for(int i = 0; i < m; ++i){
            tmp[i] = nums1[i];
        }  
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(tmp[i] <= nums2[j]) nums1[k++] = tmp[i++];
            else nums1[k++] = nums2[j++];
        }
        while(i < m) nums1[k++] = tmp[i++];
        while(j < n) nums1[k++] = nums2[j++];
    }
};

