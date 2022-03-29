 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k=m+n-1;
        int i=m-1,j=n-1;
        while(i>=0||j>=0){
            if(i>=0&&j>=0){
                if(nums1[i]>=nums2[j]){
                    nums1[k--] = nums1[i--];
                }else{
                    nums1[k--] = nums2[j--];
                }
            }else if(i>=0) nums1[k--] = nums1[i--];
            else if(j>=0) nums1[k--] = nums2[j--];
        }
    }
};

