 class Solution {
public:  
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int, int> hash;//由于unorder_map速度要比map快所以选择无序哈希表  
        for(int i=0; i < nums.size();++i){
            int another = target - nums[i];
            if(hash.count(another)){  
                res = vector<int>({hash[another], i});
                return res;
            }
            hash[nums[i]] = i;
        }
        return res;
    }
};

