 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int posi = m+n-1;
        m--, n--;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[posi] = nums1[m];
                posi--;
                m--;
            }
            else{
                nums1[posi] = nums2[n];
                posi--;
                n--;
            }
        }

        for(;m>=0;m--,posi--){
            nums1[posi] = nums1[m];
        }

        for(;n>=0;n--,posi--){
            nums1[posi] = nums2[n];
        }

    }
};

