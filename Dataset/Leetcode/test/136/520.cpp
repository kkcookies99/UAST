 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(auto c : nums){
            res ^= c;//将每个元素都做异或运算 
        };
        return res;
    };
};

