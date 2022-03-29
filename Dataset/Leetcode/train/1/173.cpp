 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int, int> hash;  // 无序的hash表，底层hash表,时间复杂度是O(1)
        for(int i=0; i < nums.size();++i){
            int another = target - nums[i];
            if(hash.count(another)){  // 被查找元素的个数，结果是1或者0
                res = vector<int>({hash[another], i});
                break;
            }
            hash[nums[i]] = i;
        }
        return res;
    }
};

