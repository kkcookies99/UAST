 class Solution {
public:
    int singleNumber(vector<int>& nums) {

        //异或的最优解        相同为0 相异为1，a^b^a=b
        int result=0;
        for(int i=0;i<nums.size();i++)
            result ^=nums[i];
        return result;
        
        /*
        if(nums.size()<=0)
        {
            return 0;
        }
        if(nums.size()==1)
        {
            return nums[0];
        }
        vector<int>::iterator iter=nums.begin()+1;
        vector<int> vec(nums.size(),0);
        int index;
        while(iter<nums.end())
        {
            index=*iter;
            vec[index]++;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(vec[i]==1)
            {
                return i;
            }
        }
        return 0;
        */
        
    }
};

