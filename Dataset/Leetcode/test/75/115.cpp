class Solution {
public:
    void XXX(vector<int>& nums) {
        //sort(nums.begin(),nums.end());
        int count0=0,count1=0,count2=0;
        for(auto i:nums)
        {
            if(i==0)
                count0++;
            if(i==1)
                count1++;
            if(i==2)
                count2++;
        }
        for(int i=0;i<count0;i++)
        {
            nums[i]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            nums[i]=1;
        }
        for(int i=count0+count1;i<count0+count1+count2;i++)
        {
            nums[i]=2;
        }
    }
};

