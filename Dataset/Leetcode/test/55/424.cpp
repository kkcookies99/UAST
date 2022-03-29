 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return true;
        for(int i = 0,farest = 0; i < n; ++i){
            farest = max(farest,i+nums[i]);
            if(i == farest) //前进不了了，完蛋了
                return false;
            if(farest >= n-1){
                break;
            }
        }
        return true;
    }
};

