 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> record(nums.size(), -1);
        vector<int> arr;
        try_to_find(record, nums, 0, arr);
        return ans;        
    }
private:
    vector< vector<int> > ans;
    void try_to_find(vector<int>& record, vector<int>& nums, int index, vector<int> arr)
    {
        if(index >= nums.size()) {
            ans.push_back(arr);
            return;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(record[i] == -1) {
                record[i] = 1;
                arr.push_back(nums[i]);
                try_to_find(record, nums, index+1, arr);
                record[i] = -1;
                arr.pop_back();
            }  
        }
    }
};

