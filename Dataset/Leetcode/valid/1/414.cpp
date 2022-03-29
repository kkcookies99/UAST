 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> res;
        map<int,int> mm;
        int l=nums.size();
        for(int i=0;i<l;++i){
            mm.insert(pair<int,int>(nums[i],i));
        }
        for(int i=0;i<l;++i){
            if(mm.count(target-nums[i]) && mm[target-nums[i]]!=i){
                res.push_back(i);
                res.push_back(mm[target-nums[i]]);
                break;
            }
        }
        return res;
    }
};

