 class Solution {
public:
    void XXX(vector<int>& nums) {
        int len=nums.size(),i=0,j=0,k=len-1;
        while(j<=k)
        {
            if(nums[j]==1)
                j++;
            else if(nums[j]==0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else
            {
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }
        }
    }
};

