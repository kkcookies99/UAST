class Solution {
public:
    bool XXX(vector<int>& nums) {
        int cover = 0;
        for(int i = 0; i < nums.size() - 1; i++){
            cover = cover < i ? cover : max(cover, nums[i] + i);
        }
        return cover >= nums.size() - 1;
    }
};

