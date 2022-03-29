 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++)
        {
            if(mp.count(nums[i]))
                mp[nums[i]]++;
            else
                mp.insert(pair<int,int>(nums[i],1));
        }
        for(auto it:mp)
            if(it.second==1)
                return it.first;
        return -1;
    }
};

