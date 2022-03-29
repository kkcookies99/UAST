 class Solution {
public:
    int XXX(vector<int>& nums) {
        int i  = 0; // 比较慢的索引
        int j = 1;  // 比较快的索引
        int k = 0;  // 删除掉的数字的数量
        while (j < nums.size()) {
            if (nums[i] == nums[j]) {
                k++;
                j++;
            } else {
                nums[++i] = nums[j++];
            }
        }
        return nums.size() - k;
    }
};

