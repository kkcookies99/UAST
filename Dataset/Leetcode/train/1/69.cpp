 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int>umap;
        for(int i = 0;i<nums.size();++i)//O(n)
        {
            unordered_map<int, int>::iterator it = umap.find(target-nums[i]);
            if(it!=umap.end())
                return {i, it->second};
            umap.emplace(nums[i], i);
        }
        return {};
    }
};

