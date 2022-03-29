class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0,j=nums.size()-1,cur=0;
        while (i<=j)
        {
            if (nums[i]==0)
            {
                nums[i++]=nums[cur];
                nums[cur++]=0;
            }
            else if (nums[i]==2)
            {
                nums[i]=nums[j];
                nums[j--]=2;
            }
            else i++;
        }
    }
};

