 class Solution {
public:
    void XXX(vector<int>& nums) {
        vector<int> array(3,0);
        for(auto x:nums)
            array[x]++;
        for(int i=0,j=0;i<3;i++)
        {
            while(array[i]--)
                nums[j++]=i;
        }   
    }
};

