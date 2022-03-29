 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        if(nums.size() < 2) return {};
        // for(int i = 0;i < nums.size()-1;i++){//方法一：暴力遍历
        //     for(int j=i+1;j<nums.size();j++){
        //         if(nums[i]+nums[j] == target) return {i,j};
        //     }
        // }
        // return {};

        unordered_map<int,int> mymap;//哈希
        for(int i=0;i<nums.size();i++){
            if(mymap.find(nums[i]) != mymap.end()) return{mymap[nums[i]],i};
            mymap[target-nums[i]] = i;
        }
        return {};
    }
};

