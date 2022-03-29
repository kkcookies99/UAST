 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> ans;
        ans.reserve(2);
        
        std::unordered_map<int, int> map;
        std::unordered_map<int, int>::iterator it;
        int k = nums.size();
        for (int i=0; i<k; i++){
             map.insert(std::make_pair(nums[i], i));         
             if (((it = map.find(target-nums[i])) != map.end()) && (it->second != i)) {                      
                 ans.push_back(it->second);
                 ans.push_back(i);
                 return ans;
             }
        }
        return ans;
    }
};
