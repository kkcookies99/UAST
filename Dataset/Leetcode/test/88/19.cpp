 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int last=m+n-1;
        while(n){
            if(m==0||nums1[m-1]<=nums2[n-1]){
                nums1[last--]=nums2[--n];
            }else{
                nums1[last--]=nums1[--m];
            }
        }
    }
};

