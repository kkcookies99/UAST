class Solution {
public:
    void XXX(vector<int>& nums) {
        vector<int> colorCnt(3);

        for (int num : nums)
            ++colorCnt[num];

        int k = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = k; j < k+colorCnt[i]; ++j)
                nums[j] = i;
            k += colorCnt[i];
        }
    }
};

