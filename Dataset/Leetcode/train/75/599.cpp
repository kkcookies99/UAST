 class Solution {
public:
    void XXX(vector<int>& nums) {
        if(nums.size() <= 1) return;
        int cur = 0,pre = -1,last = nums.size();
        while(cur < last){
            if(nums[cur] < 1)
                swap(nums[++pre],nums[cur++]);
            else if(nums[cur] > 1)
                swap(nums[cur],nums[--last]);
            else cur++;
        }
    }
};

