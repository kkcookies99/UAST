class Solution {
public:
    vector<vector<int> > res;
    vector<int> cur;
    map<int, bool> used;
    void bt(const vector<int> &nums, int idx){
        if(idx >= nums.size()){
            res.push_back(cur);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(used[nums[i]] == false){
                cur.push_back(nums[i]); idx++; used[nums[i]] = true;
                bt(nums, idx);
                cur.pop_back(); idx--; used[nums[i]] = false;
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        bt(nums, 0);
        return res;
    }
};

