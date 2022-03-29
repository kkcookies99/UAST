 class Solution {
private:
    double findTargetNum(vector<int>& nums1, vector<int>& nums2, int targetIndex) {
        nums1.push_back(INT_MAX);
        nums2.push_back(INT_MAX);
        if (nums1.empty()) {
            return nums2[targetIndex];
        }
        if (nums2.empty()) {
            return nums1[targetIndex];
        }
        int i = 0, j = 0;
        double target;
        while(i + j <= targetIndex) {
            if (nums1[i] <= nums2[j]) {
                target = nums1[i++];
            }
            else {
                target = nums2[j++];
            }
        }
        return target;
    }
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int size = nums1.size() + nums2.size();
        if (size % 2 == 1) return findTargetNum(nums1, nums2, size/2);
        else return (findTargetNum(nums1, nums2, size/2) + findTargetNum(nums1, nums2, size/2-1)) / 2.0;
    }
};

