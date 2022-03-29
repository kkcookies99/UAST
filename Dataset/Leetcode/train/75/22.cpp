class Solution {
public:
    void XXX(vector<int>& nums) { // 荷兰国旗问题，典型的快排
        int left=0,k=0,right=nums.size()-1; 
        //left标注红色最右，right标注蓝色最左，k为当前遍历位置
        while(k<=right) //right之后全是蓝色
        {
            switch(nums[k])
            {
                case 0: swap(nums[k],nums[left++]);k++;break;
                case 1: k++;break;
                case 2: swap(nums[k],nums[right--]);break; //此时k留在原地，交换过来的元素不一定是白色
            }
        }
    }
};

