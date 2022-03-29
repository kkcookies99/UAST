 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>ans;
        sort(nums.begin(),nums.end());
        int z=0,sum=0,j=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0)break;
            if(i>0&&nums[i]==nums[i-1])continue;//去重
            z=nums.size()-1;
            j=i+1;
            while(j<z){
                sum=nums[i]+nums[j]+nums[z];
                if(sum==0){
                while(j<z&&nums[j]==nums[j+1])++j;//去重
                while(j<z&&nums[z]==nums[z-1])--z;//去重
                ans.push_back({nums[i],nums[j++],nums[z--]});
                }
                else if(sum>0)--z;
                else if(sum<0)++j;
            }
        }
        return ans;
    }
};

