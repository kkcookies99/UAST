 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        if(n<2)
            return n;
        //初始化:[0,j]=没有重复的区间
        int j=0,i=1;
        //退出条件：当i到达数组的长度时，也就是搜完了整个数组
        while(i<n)
        {
            //循环条件1：如果i指向的等于j指向的数字相等，那就i继续往后移动
            if(nums[i]==nums[j])
                i++;
            else//循环条件2：如果i指向的和j指向的数字不相等，那就把j往后挪一位，然后把i指向的数组赋值给j，此时[0,j]依然是没有重复的区间
            {
                j++;
                nums[j]=nums[i++];
            }
        }
        //搜完之后j+1就是没有重复的数字的个数
        return j+1;

    }
};

