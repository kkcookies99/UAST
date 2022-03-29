 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int pre = 0;
        int back = nums.size() - 1;
        if(target > nums[back])return back+1;
        while(pre < back){
            int index = pre + (back - pre) / 2;
            if(nums[index] < target){
                pre = index + 1;
            }else{
                back = index;
            }
        }
        return pre;
    }
};

