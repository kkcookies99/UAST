class Solution {
private:
    vector<vector<int>> ans;
    void backtrack(vector<int>& nums, vector<int>& vec, vector<int>& visited){
        if(vec.size()==nums.size()){
            ans.push_back(vec);
            return;
        }
        for(int i=0;i<nums.size();i++){
            // for循环与push pop操作保证每个位置可以是nums中的任意一个数
            if(visited[i]==false){
                visited[i]=true;
                vec.push_back(nums[i]);
                backtrack(nums,vec,visited);
                vec.pop_back();
                visited[i]=false;
            }
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        // 回溯法
        vector<int> tmp;
        vector<int> visited(nums.size(),false);
        backtrack(nums,tmp,visited);
        return ans;
    }
};

