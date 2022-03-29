 class Solution {
public:
    int XXX(vector<int>& nums) {
        int mins=0,sum=0,ans=-1e9;
        for( int v:nums ) sum+=v,ans=max(ans,sum-mins),mins=min(mins,sum);
        return ans;
    }
};

