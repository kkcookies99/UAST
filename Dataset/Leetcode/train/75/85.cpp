class Solution {
public:
    void XXX(vector<int>& nums) {
        for(int i = 0, j = 0, k = nums.size() - 1; i <= k; ) {
            if(nums[i] == 0) swap(nums[i ++], nums[j ++]);
            else if(nums[i] == 2) swap(nums[i], nums[k --]);
            else i ++;
        }
    }
};

