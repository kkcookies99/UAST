 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> temp;
        unordered_map<int, int> hashmap;
        for (int i = 0; i < nums.size(); i++)
        {
            int comp = target - nums[i];
            auto iter = hashmap.find(comp);
            if (iter != hashmap.end())
            {
                temp.push_back(iter->second);
                temp.push_back(i);
                break;
            }
            hashmap[nums[i]] = i;
        }
        return temp;
    }
};

