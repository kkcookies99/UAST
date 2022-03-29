 class Solution {
public:
    void mySwap(vector<int>&nums,int l1,int l2)
    {
        int temp=nums[l1];
        nums[l1]=nums[l2];
        nums[l2]=temp;
    }
    void XXX(vector<int>& nums) {
        int start=-1;//小于等于start的位置存放0
        int end=nums.size();//大于等于end的位置存放2
        int index=0;
        while(index<end)
        {
            if(nums[index]==0)
            {
                mySwap(nums,index++,++start);//位于start和index之间的肯定是1，所以交换完后不必判断拿回来的是什么数
                continue;
            }
            else if(nums[index]==2)//如果是2，交换完后index不加，因为要判断交换回来的数是否还需要交换
            {
                mySwap(nums,index,--end);
            }
            else
            {
                ++index;
            }
        }
    }
};

