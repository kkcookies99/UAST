class Solution {
public:
    vector<vector<int>> ans;
    int len;
    vector<vector<int>> XXX(vector<int>& nums) {
        //对于每个元素，两个选择，包含，不包含
        vector<int> track;
        len = nums.size();
        ans.push_back({});//直接把空集先放入，不然后面会多次放入空集
        dfs(0,track,nums);
        return ans;
    }
    
    void dfs(int index, vector<int> &track,vector<int>& nums){
        if(index==len) return;
        track.push_back(nums[index]);
        ans.push_back(track);
        dfs(index+1,track,nums);//包含当前元素
        track.pop_back();
        dfs(index+1,track,nums);//不包含
        return;
    }
};

