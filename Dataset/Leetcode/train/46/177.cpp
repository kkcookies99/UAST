class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums);
        return res;
    }
private:
    int a[6]={0};
    vector<int> temp;
    vector<vector<int>> res;
    void dfs(vector<int>& nums){
        if(temp.size()==nums.size()){
            res.push_back(temp);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(a[i]==0){
                a[i]=1;
                temp.push_back(nums[i]);
                dfs(nums);
                temp.pop_back();
                a[i]=0;
            }
        }
    }
};

