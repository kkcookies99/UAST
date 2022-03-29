 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        int k = nums[0];
        if(n <= 1){
            return true;
        }
        for(int i = 0; i < n-1; i++){
            k = max(k, nums[i]);
            if(k == 0){
                return false;
            } 
            k--;
        }
        return true;
    }
};```

