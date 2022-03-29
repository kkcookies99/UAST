 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<vector<int>> ans;
        int pre1;
        int pre2;
        int pre3;
        for(int i=0;i<n;i++)
        {
            if(i==0 || nums[i]!=pre1)
            {
                pre1 = nums[i];
                for(int j=i+1;j<n;j++)
                {
                    if(j==i+1 || nums[j]!=pre2)
                    {
                        pre2 = nums[j];
                        for(int k=j+1;k<n;k++)
                        {
                            if(k==j+1||nums[k]!=pre3)
                            {
                                pre3 = nums[k];
                                if(nums[i]+nums[j]+nums[k]==0)
                                {
                                    ans.push_back({nums[i],nums[j],nums[k]});
                                }
                            }
                            else
                            {
                                continue;
                            }
                        }
                    }
                    else
                    {
                        continue;
                    }
                }
            }
            else
            {
                continue;
            }
        }
        return ans;
    }
};

