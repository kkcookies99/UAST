 class Solution {
public:
    bool XXX(vector<int>& nums) {
    int len=nums.size();
    int step=0;           //当前数字可能跳动的最大步长
    int end=0;                  //每次跳动的边界，指的是下标
        for (int i=0; i<len-1; i++){            //不用访问数组的最后一个元素,否则可能读取最后一个值，多走一步    
            if (step >= i ){      
                step = max(step,i+nums[i]);   //比较当前数字能跳到的位置和上一个数字能跳的位置，始终存储着最大值
                if (i==end){              //当i到达边界时，进行下一次跳动并更新边界
                    end = step;
                }                        
            }
        }
        if (end>=len-1)
        return true;
        else return false;
    }
};

