 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }
        for(int i=1;i<m+n;i++){
            int j=i;
            while(nums1[j-1]>nums1[j]){
                int t = nums1[j-1];
                nums1[j-1] = nums1[j];
                nums1[j] = t;
                j--;
                if(j==0) break;
            }
        }
    }
};

