class Solution {
public:
    void getSubSet(vector<vector<int>>& result, vector<int>& path, vector<int>& nums, int startIndex){
        if(startIndex >= nums.size()){
            return;
        }
        for(int i = startIndex; i < nums.size(); i++){
            path.push_back(nums[i]);
            result.push_back(path);
            getSubSet(result, path, nums, i + 1);
            path.pop_back();
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> path;
        result.push_back(path);//空集
        getSubSet(result, path, nums, 0);
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


