 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        set<vector<int>> S;
        for(int i = 0; i < nums.size(); ++i){
            vector<int> tmp;
            int l = 0, r = nums.size() - 1;
            while(l < r){
                if(l == i) {break;}
                if(r == i) {break;}
                if(nums[l] + nums[r] + nums[i] == 0){
                    vector<int> tmp = {nums[l],nums[i],nums[r]};
                    S.insert(tmp); ++l; --r;
                }else if(nums[l] + nums[r] + nums[i] < 0){
                    ++l;
                }else --r;
            }
        }
        vector<vector<int>> res(S.begin(), S.end());
        return res;
    }
};