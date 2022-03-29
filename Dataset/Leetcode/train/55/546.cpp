 class Solution {
public:
/*贪心算法，遍历nums，不断更新可以达到的最远距离max_diantance*/
    bool XXX(vector<int>& nums) {
        int max_distance=0;
        for(int i=0;i<=max_distance;i++){
            max_distance=max(max_distance,i+nums[i]);
            if(max_distance>=nums.size()-1)
        return true;
        }
        return false;
    }
};

