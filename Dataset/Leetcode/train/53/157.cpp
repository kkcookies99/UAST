class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        int max = 0;//最终的最大值
        int sum = 0;//每次计算的大于0的片段的和
        int flag = 0;//标记此时sum重置。重新找第一个正整数值
       // int start = -1;//最大片段的首索引的前一位
        //int index = -1;//最大片段的尾索引
        //int x = 0;//最大片段的首索引
        int tmp=nums[0];//为了防止全负数的数组，其中存比前一个大的数
        //数组中既有正数也有负数，则最小片段必定大于零
        for(int i = 0;i < n;i++)
        {
            if(tmp <= nums[i])
                tmp = nums[i];
            if(sum<0)
            {
                flag = 0;
                sum = 0;
            }
            if(nums[i]>0)
                flag = 1;
            if(nums[i] < 0 && flag == 0)
            {
                //start = i;//start为最终选定数组的第一个值的前一个
                continue;
            }//只有当第一个数是大于0时才会开始加
            sum += nums[i];
            
            if(sum > max)
            {
                max = sum;
                //index = i;
                //x = start + 1;
            }

        }
        if(tmp <= 0)
            return tmp;
        return max;
    }
};

