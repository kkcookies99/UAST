 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
    double res=0;

    for (int i = 0; i < nums2.size(); ++i) {
        nums1.push_back(nums2[i]);
    }
    for (int i = 0; i < nums1.size(); ++i) {

        for (int j = 0; j < nums1.size() - 1; ++j) {
            if (nums1[j] >= nums1[j + 1]) {
                int tmp = nums1[j];
                nums1[j] = nums1[j + 1];
                nums1[j + 1] = tmp;
            }

        }

    }
    if (nums1.size() % 2 == 0) {
        double a1=nums1[nums1.size()/2-1];
        double a2=nums1[nums1.size()/2];
        res=(a1+a2)/2;

    }
    if (nums1.size() % 2 != 0) {
        int a = nums1.size() / 2;
        res = nums1[a];

    }
    return res;

}
};

