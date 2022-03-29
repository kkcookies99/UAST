 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len = nums.size(), temp = len-1;
        for(int i = len-2; i >= 0; i--){
            if(nums[i] + i >= temp)
                temp = i;
        }
        return !temp;
    }
};

