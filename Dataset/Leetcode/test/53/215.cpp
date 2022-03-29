class Solution {
public:
    int XXX(vector<int>& nums) {
        int res=INT_MIN;
        int maxsubarr=0;
        for(auto num:nums){
            maxsubarr=max(num,maxsubarr+num);
            res=max(maxsubarr,res);
        }
        return res;
    }
};

