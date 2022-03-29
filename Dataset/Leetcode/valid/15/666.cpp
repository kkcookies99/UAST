 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n=nums.size();
        if(n<3)return {};

        vector<vector<int>> res;

        sort(nums.begin(),nums.end());
        
        int flag=9999999;//判断i是否重复
        for(int i=0;i<n-2;i++){
            if(nums[i]==flag)continue;
            int l=i+1,r=n-1;
            while(l<r){
                if(nums[l]+nums[r]<-nums[i])++l;
                else if(nums[l]+nums[r]>-nums[i])--r;
                else{
                    res.push_back({nums[i],nums[l],nums[r]});
                    flag=nums[i];
                    //l<r是为了不超出边界
                    while(l<r&&nums[l]==nums[l+1])++l;
                    while(l<r&&nums[r]==nums[r-1])--r;
                    ++l,--r;
                }
            }
        }

        return res;
    }
};

