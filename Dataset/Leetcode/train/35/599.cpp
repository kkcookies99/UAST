 class Solution {
public:
// 我们需要在nums中找到这样一个位置a，满足：
// a左边的都小于target，右边的包括a都大于等于target
    int XXX(vector<int>& nums, int target) {
        int l = 0, r = nums.size() - 1;
        while (l <= r)
        {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target)
                l = mid + 1; // l左边的都小于target（不确定是否包含l）
            else
                r = mid - 1; // r右边的都大于等于target（不确定是否包含r）
        // 每次循环，区间长度至少减一
        // l=r时，mid=l=r
        // 若nums[mid] < target，l向后移动一位
        // 否则，r向左移动一位
        // 即r+1=l
        }
// 结束循环时，在right和left之间画一条竖线，恰好可以把数组分为两部分：
// left左边的部分和right右边的部分，
// 而且left左边的部分全部小于target，并以right结尾；
// right右边的部分全部大于等于target，并以left为首；
// 即left左边的都小于target，右边包括left都大于等target，
// 所以最终答案一定在left的位置
// 即前面要的a
// 与69题不一样
        return l;
    }
};

