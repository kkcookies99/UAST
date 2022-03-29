 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int i = 0, j = 0, num[m+n];
    while (i < m || j < n) {
        if(m==0){
            for(j=0;j<n;j++) num[j]=nums2[j];
            break;
        } 
        if(n==0){
            for(i=0;i<m;i++) num[i]=nums1[i];
            break;
        }
        while (i < m&&(nums1[i] <= nums2[j] || j == n)){
            num[i + j] = nums1[i];
            i++;
        } 
        while (j < n&&(nums2[j] <= nums1[i] || i == m)){
            num[i + j] = nums2[j];
            j++;
        }
    }
    for (i = 0; i < m + n; i++) nums1[i] = num[i];
    }
};

