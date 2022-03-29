 class Solution {
public:
    int XXX(vector<int>& nums) {
        int len=nums.size();
        if(len == 0)  return NULL;
        int sum=-1;
        int res=INT_MIN; //定义理论上的最小值
        for(int i=0;i<len;i++){
            if(sum<=0)  sum=nums[i];
            else  sum+=nums[i];
            res=max(res,sum); //不断更新最大和
        }
        return res;
    }
};



