class Solution {
public:
    void XXX(vector<int>& nums) {
        int size = nums.size();
        int head = 0;
        int tail = size-1;
        int curr = 0;
        while(curr <= tail){
            if(nums[curr] == 0) swap(nums[head++],nums[curr++]);
            else if(nums[curr] == 1) curr++;
            else swap(nums[tail--],nums[curr]);                    
        }
    }
};

