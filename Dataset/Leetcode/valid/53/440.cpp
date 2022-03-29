 class Solution {
public:
    int XXX(vector<int>& nums) {
        int i = 0;
        int j = 0;
        int res = nums[0];
        int tmpCount = nums[0];
        while(j+1 < nums.size())
        {
            j++;
            if(tmpCount <= 0)
            {
                i = j;
                tmpCount = nums[j];
            }
            else if(tmpCount > 0) tmpCount += nums[j];
            res = max(res,tmpCount);
        }
        return res;
    }
};

