class Solution {
public:
    vector<vector<int>> res;
    vector<int> temp;
    vector<vector<int>> XXX(vector<int>& nums) {
        int count = nums.size();
        if(count==0)
            return res;
        sort(nums.begin(),nums.end());
        vector<bool> visited(count,0);
        dfs(nums,visited);
        return res;
    }
    void dfs(vector<int>& nums,vector<bool>& visited){
        if(temp.size()==nums.size()){
            res.push_back(temp);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(visited[i]==false){
                visited[i] = 1;
                temp.push_back(nums[i]);
                dfs(nums,visited);
                temp.pop_back();
                visited[i] = false;
            }
        }
        return;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


