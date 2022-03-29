 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int , int> hashmap;
        vector<int> retVec;
        for(int i = 0; i < nums.size(); i++)
        {
            if(hashmap.count(target - nums[i]) > 0)
            {
                retVec.push_back(hashmap[target - nums[i]]);
                retVec.push_back(i);
                return retVec;
            }
            hashmap[nums[i]] = i;
        }
        return retVec;
    }
};

