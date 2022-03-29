 vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());        
        for(int i=0;i<nums.size() && nums[i]<=0;i++)          
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int first=i+1; int last=nums.size()-1;
            while(first<last)
            {
                int sums=nums[i]+nums[first]+nums[last];
                if(sums>0)
                    last--;
                else if(sums<0)
                    first++;
                else 
                {
                    result.push_back(vector<int>{nums[i],nums[first],nums[last]});
                    first++;
                    while(first<last && nums[first]==nums[first-1])
                        first++;
                }
            }                       
        }
        return result;        
    }
