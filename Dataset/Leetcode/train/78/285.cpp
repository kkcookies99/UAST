class Solution {
public:
    vector<vector<int>> result;
    vector<int> vec;

    void getresult(int &k, int index, vector<int>& nums){
        result.push_back(vec);
        if(index >= k){
            return;
        }

        for(int i = index; i < k; i++){
            vec.push_back(nums[i]);
            getresult(k, i + 1, nums);
            vec.pop_back();
        }

    }

    vector<vector<int>> XXX(vector<int>& nums) {
        int k = nums.size();
        getresult(k, 0, nums);
        return result;
    }
};

