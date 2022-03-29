 class Solution {
public:
    int XXX(vector<int>& nums, int val) {  
        int left =0;//定义一个统计结果的整数，也可以看做是定义索引位置
        for(int right =0;right<nums.size();right++){//遍历数组
            if (nums[right]!=val){//找到数组中不为val的元素，要注意理解为何不选择与val相同的元素，因为要统计与val不同的元素的个数
                nums[left]=nums[right];//把与val不相同的元素赋值给索引位置，
                left++;//将索引位置向后移动一位
            }
        }
        return left;//返回与val不相同元素的个数
    }
};