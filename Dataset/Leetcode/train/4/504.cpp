 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.empty() && nums2.empty()) {
            return 0.0;
        } else if(nums1.empty() && nums2.size() == 1) {
            return nums2[0];
        }
        else if(nums2.empty() && nums1.size() == 1) {
            return nums1[0];
        }

        std::vector<int> merge;
        std::merge(nums1.begin(), nums1.end(), nums2.begin(), nums2.end(), std::back_inserter(merge)); //对于有序的数组可以执行合并操作
        if(merge.size() % 2 == 0) { //偶数时，两个中间数计算平均值
            return (double)(merge[merge.size()/2 - 1] + merge[merge.size()/2]) / 2.0; 
        }
        return (double)(merge[merge.size()/2]) / 1.0; //奇数时返回中间值
    }
};

