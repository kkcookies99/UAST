 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=m-1,j=n-1,k=m+n-1;k>=0;--k){
            if(i==-1){
                nums1[k]=nums2[j--];
            }
            else if(j==-1){
                return;
            }
            else if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i--];
            }
            else{
                nums1[k]=nums2[j--];
            }
        }
    }
};

