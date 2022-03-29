 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=0,cnt=0; i<m,cnt<n; ++i){
            if(nums1[i] != 0){
                continue;
            }
            nums1[i] = nums2[cnt];
            cnt++;
        }
        sort(nums1.begin(), nums1.end());
    }
};

