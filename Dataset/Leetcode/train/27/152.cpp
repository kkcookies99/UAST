 class Solution {
public:
    int XXX(vector<int>& nums, int val) 
    {
         vector<int>::iterator it;   //这条语句定义了一个名为it的变量，它的数据类型是由vector<int>定义的iterator类型
        for(it = nums.begin();it != nums.end();)
        {
            if(*it == val)
                it = nums.erase(it);   //删除元素，返回值指向已删除元素的下一个位置
            else
                ++it; //指向下一个位置
        }
        return nums.size();
    }
};

