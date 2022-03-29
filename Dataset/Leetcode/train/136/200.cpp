 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int id=nums[0],count=1;
        for(int i=1;i<nums.size();i++)
            if(nums[i]!=id)
                if(count==1)
                return id;
                else
                {
                    id=nums[i];count=1;
                }
            else
            count++;
            return id;
    }
};

