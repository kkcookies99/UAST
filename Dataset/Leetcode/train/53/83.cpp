class Solution {
public:
    int XXX(vector<int>& nums) {
        int max=-2147483647,sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
};

