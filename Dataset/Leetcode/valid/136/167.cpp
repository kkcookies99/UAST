 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> hash;
        for(int i:nums)
        {
            if(hash[i])
                hash.erase(i);
            else
                hash[i]++;
        }
        return hash.begin()->first;
    }
};

