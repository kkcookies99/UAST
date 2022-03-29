 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> temp;//可能的一个子集
        backTracking(nums,temp,0);
        return res;
    }
private:
    void backTracking(vector<int>& nums, vector<int>& temp, int depth){
        if(depth==nums.size()){
            res.push_back(temp);
            return;
        }
        temp.push_back(nums[depth]);//取
        backTracking(nums,temp,depth+1);//回溯递归
        temp.pop_back();//舍
        backTracking(nums,temp,depth+1);//回溯递归
    }
private:
    vector<vector<int>> res;
};

