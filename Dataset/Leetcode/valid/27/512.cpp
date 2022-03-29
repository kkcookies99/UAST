 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i=0,j=nums.size()-1;
        int ans = 0;
        while(i<=j)
        {
            if(nums[i]==val)
            {
                if(nums[j]==val)
                {
                    j--;
                }
                else
                {
                    swap(nums[i],nums[j]);
                    i++;
                    j--;
                    ans+=1;
                }
            }
            else
            {
                i++;
                ans+=1;
            }
        }
        return ans;
    }
};

