 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if (m == 0){
            for (int j=0; j<n; j++)
                nums1[j] = nums2[j];
                return;
        }
        int i = m-1;
        int j = n-1;
        while (j>=0){
            while (i>=0){
                if (nums2[j] <= nums1[i]){
                    nums1[i+j+1] = nums1[i];   //nums1[i]大，滚后面去
                }
                else{
                    nums1[i+j+1] = nums2[j];   ////nums2[j]大，滚后面去
                    break;
                }
                nums1[i] = nums2[j];
                if (i == 0)
                    break;
                i--;
            }
            j--;
        }
    }
};

