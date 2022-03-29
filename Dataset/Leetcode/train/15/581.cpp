 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        if(nums.size()<3)                   
            return ans;
        for(int i=0;i<nums.size();++i){
            if(i>0&&nums[i]==nums[i-1]) //排除第一个数重复的情况
                continue;
            if(nums[i]>0)   return ans; //排除三数中最小值都大于0的情况
            int l=i+1,r=nums.size()-1;
            int target=-nums[i];        //访问局部变量target会比在内存访问nums[i]快
            while(l<r){
                int lval=nums[l];         //同上
                int rval=nums[r];
                if(lval+rval==target){
                    ans.push_back({nums[i],lval,rval}); //访问局部变量lval和rval会更快
                    do
                        ++l;
                    while(l<r&&nums[l]==nums[l-1]);
                    do
                        --r;
                    while(l<r&&nums[r]==nums[r+1]);
                }
                else if(lval+rval<target){
                    ++l;
                }
                else{
                    --r;
                }
            }
        }
        return ans;
    }
};

