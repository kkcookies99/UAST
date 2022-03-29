 class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum=0;
        int res=INT_MIN;
        for(int ptr=0;ptr<nums.size();++ptr){
            sum+=nums[ptr];
            res=res>sum?res:sum;
            if(sum<0)sum=0;
        }
        return res;
    }
};

