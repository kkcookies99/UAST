 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
         vector<vector<int>> result;
        if(nums.size()<3)
            return result;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-2;i++){
            if(i>0&&nums[i]==nums[i-1])//去重
                continue;
            int j=i+1;
            int k=nums.size()-1;
            while(j<k){
                if(nums[j]+nums[k]==-nums[i]){
                    result.push_back({nums[i],nums[j],nums[k]});
                    j++;
                    k--;
                    while(j<k&&nums[k]==nums[k+1])//去重，为什么比较右边，因为k是是在减小
                        k--;
                    while(j<k&&nums[j]==nums[j-1])//去重，为什么比较左边，因为j是在增加
                        j++;

                }
                else if(nums[j]+nums[k]>-nums[i])
                    k--;
                else
                    j++;
            }
               
        }
        return result;
    }
};


