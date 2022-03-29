 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        unordered_map<int, int> map;
        for(int i = 0; i < nums.size(); i++){
            map[nums[i]]++;
        }
        vector<vector<int>> res;
        if(nums.size() < 3)
            return res;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size() - 2; i++){
            map[nums[i]]--;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            //temp.push_back(nums[i]);
            for(int j = i + 1; j < nums.size() - 1; j++){
                map[nums[j]]--;
                if(j > i + 1 && nums[j] ==nums[j - 1])
                    continue;
                if(map[0 - nums[i] - nums[j]] > 0){
                    vector<int> temp;
                    temp.push_back(nums[i]);
                    temp.push_back(nums[j]);
                    temp.push_back(0 - nums[i] - nums[j]);
                    res.push_back(temp);
                }
            }
            for(int j = i + 1; j < nums.size() - 1; j++){
                map[nums[j]]++;
            }
           // map[nums[i]]++;
        }
        return res;
    }
};

