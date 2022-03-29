 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxJ = 0;
        int len = nums.size();
        for(int i = 0;i < len;i++){
            if(i>maxJ) return false;
            maxJ = max(maxJ,i+nums[i]);  
            if(maxJ>=len-1) return true;
        }
        return true;
    }
};

