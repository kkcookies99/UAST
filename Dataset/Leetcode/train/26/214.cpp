 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        if(n==0)    return 0;
        int num=0;
        for(int i=0;i<n;i++)
        {
            if (nums[num] != nums[i]) 
                nums[++num] = nums[i];
        }num++;
        return num;
    }
};

