 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        if(nums.size()<3)
            return ans;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-2;i++)
        {
            int j=i+1,k=nums.size()-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                    {
                        vector<int> p{nums[i],nums[j],nums[k]};
                        ans.push_back(p);
                        while(j!=nums.size()-1&&nums[j]==nums[j+1])   j++;
                        while(k!=0&&nums[k]==nums[k-1])   k--;
                        j++;k--;
                    }
                else if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                else
                    k--;
            }
            while(i!=nums.size()-1&&nums[i]==nums[i+1])   i++;
        }
        return ans;
    }
};

