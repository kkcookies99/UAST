 class Solution {
public:
    void XXX(vector<int>& nums) {
        int length=nums.size();
        if(length<1)
            return;
        int start=-1,end=length-1,index=0;
        while(index<=end)
        {
            if(nums[index]==2)
            {
                int tmp=nums[index];
                nums[index]=nums[end];
                nums[end]=tmp;
                end--;
            }
            else if(nums[index]==0)
            {
                start++;
                if(index!=start)
                {
                    int tmp=nums[index];
                    nums[index]=nums[start];
                    nums[start]=tmp;
                }
                else
                    index++;
            }
            else
            {
                index++;
            } 
        }
    }
};

