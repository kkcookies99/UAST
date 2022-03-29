 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        //创建容器
        vector<vector<int>> result;
        //如果数组为空或者元素个数小于3，则直接返回空容器
        if (nums.empty() || nums.size() < 3) return result;
        //为了使用双指针法，先对数组进行排序
        sort(nums.begin(), nums.end());
        //排序后的数组如果第一个元素就大于0，那么就说明整个数组不可能有三个数加起来小于0，直接返回空容器
        if (nums[0] > 0) return result;
        //开始遍历数组
        for (int i = 0; i < nums.size(); i++) {
            //当i大于0，且数组中当前元素和之前的元素相同时，直接跳过，避免重复，必须是遍历到后面一个位置，再去跳过，如果是在前面一个元素的时候就跳过的话，会漏掉结果，如nums[i] = nums[i+1]
            if (i > 0 && nums[i] == nums[i-1]) continue;
            //定义左右指针，左指针从第i+1个元素起，右指针从最后一个元素起
            int left = i + 1, right = nums.size() - 1;
            //直到左指针遇到右指针之前
            while (left < right) {
                //定义三数之和
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    //如果三数之和等于0，则将它们存入到result里
                    result.push_back({nums[i], nums[left], nums[right]});
                    //此时，当nums[left]与它后面的值nums[left + 1]相等的话，那么为了避免重复，就直接跳过重复的元素，直到左右指针相遇
                    while (left < right && nums[left] == nums[left + 1]) {
                        left += 1;
                    }
                    //此时，当nums[right]与它后面的值nums[right - 1]相等的话，那么为了避免重复，就直接跳过重复的元素，直到左右指针相遇
                    while (left < right && nums[right] == nums[right - 1]) {
                        right -= 1;
                    }
                    //因为此时的nums[left]和nums[right]和nums[i]加起来已经等于0了，所以nums[left]和nums[right]时唯一配对的，所以左右两个指针同时收缩
                    left += 1;
                    right -= 1;
                }
                //当和小于0时，左指针向右移动
                else if (sum < 0) {
                    left += 1;
                }
                //当和大于0时，右指针向左移动
                else if (sum > 0) {
                    right -= 1;
                }
            }
        }
        return result;
    }
};

