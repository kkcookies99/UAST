 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxdistance = 0;      //初始设置最远距离为0
        int n = nums.size();       //n表示数组中元素的总个数
        int i;                               //i表示遍历数组的元素
        for ( i = 0; i <= maxdistance; i++) {       //从数组中第一个元素开始，一直到他可以到达的最远位置
            if (i >= n-1)          //如果在遍历更新过程中，下标超过了数组的最大位置，则证明整个数组的任意一个位置都可以到达，返回true
                return true;
            maxdistance =max(i + nums[i],maxdistance);  //在每一次遍历过程中，更新i能到达的最远位置
        }
            return false;       //如果循环结束，则证明i超过了他能到达的最远位置，说明数组中有一些位置他无法到达，返回false
    }
};

