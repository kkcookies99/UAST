 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        if(nums.size()==2){
            return vector<int>{0,1};
        }
        unordered_map<int, int>tmp;
        for(int i=0;i<nums.size();i++){
            if(tmp.find(nums[i])==tmp.end()){
                tmp[target-nums[i]] = i;
            }else{
                return vector<int>{tmp[nums[i]], i};
            }
        }
        return vector<int>{0, 0};
    }
};

