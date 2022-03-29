class Solution {
public:
    //1.贪心：若当前指针所指的元素之和小于0，则丢弃当前元素之前的序列；
    //时间复杂度：O(N)
    int XXX(vector<int>& nums) {
        int len  = nums.size();
        if(len == 1) return nums[0];
        int ans = nums[0];//最大和，
        int temp = 0;//当前和，
        int last = 0;//之前和；
        for(int i = 0; i < len; i++) {
            if(last <= 0) {
                last = nums[i];
                temp = nums[i];
            } else if(last > 0) {
                temp = last + nums[i];
                last = temp;
            }
            ans = max(ans, temp);
        }
        return ans;
    }
};

