 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        /*
        for(int i=m,j=0;i<m+n;i++){
            nums1[i]=nums2[j++];
        }
        sort(nums1.begin(),nums1.end());
        */
        int i=m-1,j=n-1;
        int end = m+n-1;
        while(j >= 0){
            nums1[end--] = (i >=0 && (nums1[i] > nums2[j])) ? nums1[i--] : nums2[j--];
        }

    }
};

