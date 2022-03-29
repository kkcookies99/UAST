 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
     
        m--;
        n--;

        while(m+1&&n+1){
            nums1[m+n+1]=nums1[m]>nums2[n]?nums1[m]:nums2[n];
            if (nums1[m]>nums2[n]) m--;
            else n--;

        }
        if(m<=0) while(n>=0){
            nums1[n]=nums2[n];
            n--;
        }
    }
};


