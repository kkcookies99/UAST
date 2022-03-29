 class Solution {
public:
    void static XXX(vector<int> &nums1, int m, vector<int> &nums2, int n) {
        vector<int> vec;
        for (int i=0;i<m;i++)
            vec.push_back(nums1[i]);
        int i=0;
        int j=0;
        for (int k = 0; k < nums1.size(); ++k) {
            if (i > m-1) {
                nums1[k] = nums2[j];
                j++;
            }
            else if (j > n-1) {
                nums1[k] = vec[i];
                i++;
            }
            else if (vec[i] < nums2[j]) {
                nums1[k] = vec[i];
                i++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
            }
        }
    }
};

