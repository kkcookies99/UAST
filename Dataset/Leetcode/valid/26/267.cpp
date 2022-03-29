 class Solution {
public:
    int XXX(vector<int>& nums) 
    {
        if(nums.size()==0)
            return 0;
        int unique=0;//新数组（元素均为不同）的指针，初始化为第0个元素
        for(int i=0;i<nums.size();++i)
        {
            if(nums[i]!=nums[unique])//只有发现不同元素的时候才移动到新数组指针加1的位置
                nums[++unique]=nums[i];
        }
        return unique+1;
    }
};

