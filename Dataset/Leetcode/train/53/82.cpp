class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum=0;
        int res=INT_MIN;
        for(int i=0;i<nums.size();++i){
            sum+=nums[i];
            res=max(sum,res);
            if(sum<0)sum=0;
        }
        return res;
    }
};

