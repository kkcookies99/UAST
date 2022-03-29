 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> hashtable;
        for(int i =0; i<nums.size();i++)
        {
            hashtable.emplace(nums[i],i);
        }
        for(int i=0;i<nums.size();i++)
        {
            auto it = hashtable.find(target - nums[i]);
            if (it != hashtable.end()) {//找不到对应元素时，指针指向end
                return {it->second, i};
            }
        }
        return {};
    }
};


