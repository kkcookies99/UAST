class Solution {
public:
    void XXX(vector<int>& nums) {
        //类似于双指针的做法，可以改进经典快排
        //less more cur
        int num = 1;//划分的界限，本题为1
        int n = nums.size();
        int less = -1;//0~less上的数都是<num的，初始化是空的
        int more = n;//more~n-1上的数都是>num的，初始化是空的
        int cur = 0;
        while(cur < more)
        {
            if(nums[cur] < num)
            {
                swap(nums,++less,cur++);
            }
            else if(nums[cur] > num)
            {
                swap(nums,--more,cur);
            }
            else
            {
                cur++;
            }
        }
    }
    void swap(vector<int>& nums,int i,int j)
    {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
    }
};

