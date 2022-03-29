 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n==0)
            return ;
        if(m==0){
            nums1 = nums2;
            return ;
        }
        int p = m-1;
        int q = n-1;
        int i = m+n-1;
        for(;i>=0;--i){
            if(nums1[p]>=nums2[q]){
                nums1[i] = nums1[p];
                p--;
            }
            else{
                nums1[i] = nums2[q];
                q--;
            }
            if(p<0){
                while(--i>=0)
                    nums1[i] = nums2[q--];
                return;
            }
            if(q<0)
                return;
        }
    }
};

