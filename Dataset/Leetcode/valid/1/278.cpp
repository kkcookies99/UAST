 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> hash;
        for(int i=0;i<nums.size();++i){
            auto t=hash.find(target-nums[i]);
            if(t!=hash.end())
                return vector{t->second,i};
            hash[nums[i]]=i;
        }
        return vector<int>();
    }
};

