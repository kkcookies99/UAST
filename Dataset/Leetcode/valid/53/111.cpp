class Solution {
public:
    int XXX(vector<int>& nums) {
        int max = nums[0];
        int temp_sum = 0;
        //if(nums.size()==1) return nums[0];
        for(int i = 1;i<nums.size()+1;i++) //子数组的元素数量  1--长度
        {
            //子数组size为i时的所有可能
            vector<int>::iterator s;  //开头
            vector<int>::iterator e;  //结尾
            for(int j = 0;j<nums.size()-i+1;j++)          //子数组从哪开始
            {
                s = nums.begin()+j;
                e = s+i;
                for(;s!=e;s++)
                {
                    temp_sum = temp_sum + *s;
                }
                if(temp_sum>max) max = temp_sum;
                temp_sum = 0;
            }

        }
        return max;
    }
};

