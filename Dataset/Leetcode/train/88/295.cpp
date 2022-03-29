 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int mn = m + n -1, i = m-1, j = n-1;
        while(i>=0 && j>=0){
            if(nums2[j] >= nums1[i]){
                nums1[mn--] = nums2[j--];
            }
            else{
                nums1[mn--] = nums1[i--];
            }
        }
        while(i>=0){
            nums1[mn--] = nums1[i--];
        }
        while(j>=0){
            nums1[mn--] = nums2[j--];
        }
    }
};

