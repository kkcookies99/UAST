 class Solution {
public:
    double XXX(vector<int> &nums1, vector<int> &nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int n = len1 + len2;
        int i = 0;
        int j = 0;
        int num = 0;
        int k1, k2;
        int z;
        k1 = k2 = INT32_MIN;

        while (len1 != i && len2 != j) {

            if (nums1[i] <= nums2[j]) {
                k1 = nums1[i];
                i++;
            } else {
                k2 = nums2[j];
                j++;
            }
            num++;

            if (num * 2 - 1 == n) {
                return max(k1, k2);
            }
            if (num * 2 == n && len1 != i && len2 != j) {
                return (max(k1, k2) + min(nums1[i], nums2[j])) / 2.0;
            }

        }
        if (i == len1) {
            if (len1 * 2 == n) {
                int num2;
                num2 = j == 0 ? k1 : nums2[j - 1];
                return (max(k1, num2) + nums2[j]) / 2.0;
            }
            z = n / 2 - len1;
            if ((z + len1) * 2 == n) {
                return (max(k1, nums2[z - 1]) + nums2[z]) / 2.0;
            } else {
                return nums2[z];
            }
        }
        if (j == len2) {
            if (len2 * 2 == n) {
                int num1;
                num1 = i == 0 ? k2 : nums1[i - 1];
                return (max(k2, num1) + nums1[i]) / 2.0;
            }
            z = n / 2 - len2;
            if ((z + len2) * 2 == n) {
                return (max(k2, nums1[z - 1]) + nums1[z]) / 2.0;
            } else {
                return nums1[z];
            }
        }

        return 0;
    }
};

