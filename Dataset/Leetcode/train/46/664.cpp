 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.empty()) return {};
        vector<vector<int>> records;
        vector<int> record;
        DFS(nums,0,nums.size()-1,record,records);
        return records;
    }
    void DFS(vector<int>& nums,int i,int j,vector<int>& record,vector<vector<int>>& records){
        if(i>j){
            records.push_back(record);
            return;
        }
        for(int p=i;p<nums.size();++p){
            swap(nums[i],nums[p]);
            record.push_back(nums[i]);
            DFS(nums,i+1,j,record,records);
            record.pop_back();
            swap(nums[i],nums[p]);
        }
    }
};

