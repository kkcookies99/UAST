 class Solution {
public:
    void XXX(vector<int>& nums) {
        vector<int> count(3, 0);
        for(int i=0;i<nums.size();i++)
        {
            count[nums[i]]++;
        }
        int cur=0;
        for(int i=0;i<3;i++)
        {
            while(count[i])
            {
                nums[cur++]=i;
                count[i]--;
            }
        }
    }
};

