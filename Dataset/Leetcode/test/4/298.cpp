 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int tot = nums1.size() + nums2.size();

        if (tot & 1)
        {
            return find(nums1, 0, nums2, 0, tot / 2 + 1);
        } else {
            int left = find(nums1, 0, nums2, 0, tot / 2);
            int right = find(nums1, 0, nums2, 0, tot / 2 + 1);
            return (left + right) / 2.0;
        }
    }

    int find(vector<int>& nums1, int i, vector<int>& nums2, int j, int k)
    {
        if (nums1.size() - i > nums2.size() - j) return find(nums2, j, nums1, i, k);
        if (k == 1)
        {
            // 如果nums1为空返回nums2的第j个值
            if (nums1.size() == i)
            {
                return nums2[j];
            } else {
                return min(nums1[i], nums2[j]);
            }
        }
        if (nums1.size() == i) return nums2[j + k - 1];
        int s1 = min((int)nums1.size(), i + k / 2), s2 = j + k - k / 2;
        if (nums1[s1 - 1] > nums2[s2 - 1])
        {
            return find(nums1, i, nums2, s2, k - s2 + j);
        } else {
            return find(nums1, s1, nums2, j, k - s1 + i);
        }
    }
};

