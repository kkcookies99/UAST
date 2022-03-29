 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int l=i+1,r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==-nums[i]){
                    res.push_back(vector<int>{nums[i],nums[l],nums[r]});
                    //寻找下一个不同的左值
                    while(l<r && nums[l++]==nums[l])
                        continue;
                }
                else if(sum>-nums[i]){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }
};

