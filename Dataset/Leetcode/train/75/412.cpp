 class Solution {
public:
    void XXX(vector<int>& nums) {
        int n=nums.size();
        int left=-1,right=n,i=0;
             
        while(i<right)
        {
            if(nums[i]==0)
            {
                swap(nums[left+1],nums[i]);
                left++;
                if(i==left)i++;
            }
            else if(nums[i]==2)
            {
                swap(nums[right-1],nums[i]);
                right--;
            }
            else
            {
                i++;
            }
        }
    }
};

