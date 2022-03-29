 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> mp;
        int f=0;

        for(auto a:nums)
            f ^=a;  //++mp[a];
/*
        for(auto b:mp)
            if(b.second == 1)
                return b.first;
*/
        return f;
    }
};

