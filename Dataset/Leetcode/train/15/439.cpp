 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        int t,len=0;
        if(nums.size()<3)
        {
            return {};
        }
        else if(nums.size()>2)
        {
            int temp;
            for(int i=0;i<nums.size()-1;i++)
            {
                for(int j=0;j<nums.size()-1-i;j++)
                {
                    if(nums[j]>nums[j+1])
                    {
                        temp = nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
            for(t=0;t<nums.size();t++)
            {
                if(nums[t]<=0)
                {
                    len++;
                }
            }
            if(nums[0]>0 || nums[nums.size()-1]<0)
            {
                return {};
            }
            else
            {
                int i=0;
                int hear,end;
                int sum=0;
                for(i=0;i<len;i++)
                {
                    if(i>0 && nums[i]==nums[i-1])
                        continue;
                    hear=i+1;
                    end=nums.size()-1;   
                    while(hear<end)
                    {
                        sum=nums[i]+nums[hear]+nums[end];
                        if(sum==0)
                        {
                            result.push_back({nums[i],nums[hear],nums[end]});
                            while(hear<end && nums[hear]==nums[hear+1])
                                hear++;
                            while(hear<end && nums[end]==nums[end-1])
                                end--;
                            hear++;
                            end--;
                        }
                        if(sum>0)
                            end--;
                        if(sum<0)
                            hear++;
                    }
                }
            }
        }
        return result;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


