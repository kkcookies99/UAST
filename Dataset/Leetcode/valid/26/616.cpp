 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()<2) return nums.size();
        int j=0;
        for(int i=1;i<nums.size();i++)//使用i指针扫描一遍nums数组
        {
            if(nums[j]!=nums[i]) nums[++j]=nums[i];//如果i和j不相同就赋值在nums
        }
        len=j;//得到前j+1个不相同的数字；
        while(len+1!=nums.size())
        {
            nums.pop_back();
        }
        return ++j;

    }
};

