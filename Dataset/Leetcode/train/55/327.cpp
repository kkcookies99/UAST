class Solution {
public:
    int mx = 0;
    bool XXX(vector<int>& nums) {
        for(int i = 0;i<nums.size();i++){
            if(i && mx < i) return 0;
            mx = max(mx,i + nums[i]);
        }
        return 1;
    }
};

