 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> cnt;
        int n=nums.size();
        int res=0;
        for(int i=n-2;i>=0;--i)
        {   cnt[nums[i+1]]=i+1;
            if(cnt.count(target-nums[i]))
            return {i,cnt[target-nums[i]]};
        }
        return { };
    }
};

