class Solution {
public:
    bool XXX(vector<int>& nums) {
        int l=0,r=0,i=0;//左边界、右边界、遍历下标的指针
        while(l+1<nums.size()){//如果左边界超出数组边界退出循环
            if(i+nums[i]>r)r=i+nums[i];//更新右边界
            if(i++==l){
                if(l==r)return false;//左右边界相撞，GG
                else l=r;//更新左边界
            }
        }
        return true;
    }
};

