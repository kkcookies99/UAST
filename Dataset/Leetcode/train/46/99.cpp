class Solution {
private:
    vector<vector<int>> ans;
    void backtrack(vector<int>& nums, vector<int>& vec){
        if(vec.size()==nums.size()){
            ans.push_back(vec);
            return;
        }
        for(int i=0;i<nums.size();i++){
            // for循环与push pop操作保证每个位置可以是nums中的任一一个数
            if(vec.end()!=find(vec.begin(),vec.end(),nums[i]))
                continue;
            vec.push_back(nums[i]);
            backtrack(nums,vec);
            vec.pop_back();
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        // 回溯法
        vector<int> tmp;
        backtrack(nums,tmp);
        return ans;
    }
};

