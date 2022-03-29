 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> lookup;
        vector<int> res;
        for(int i = 0; i < nums.size(); i++)
        {
            int num_to_find = target - nums[i];
            if(lookup.find(num_to_find) != lookup.end()) 
            {
                res.push_back(lookup[num_to_find]);
                res.push_back(i);
                return res ;     
            }
            lookup[nums[i]] = i;
        }
        return res;
        
    }
};

