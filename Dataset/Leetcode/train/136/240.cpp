 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int temp=0;
        for(int i:nums)
            temp^=i;
        return temp;
    }
};

