 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=m-1,j=n-1;
        while(j>=0 && i>=0){
            if(nums1[i]<nums2[j])
                nums1[i+j+2]=nums2[j--];   //nums1[2+2+2] ?????
            else
                nums1[i+j+2]=nums1[i--];
        }
        for(;j>=0;j--){
            nums1[j]=nums2[j];
        }
    }
};

