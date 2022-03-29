class Solution {
public:
    void XXX(vector<int>& nums) {
        int zero = 0, two = nums.size() - 1;
        for(int i = 0; i <= two; ++i) {
            if(nums[i] == 2) {
                while(two >= zero && nums[two] == 2)
                    --two;
                if(i < two) {
                    swap(nums[i], nums[two]);
                    --two;
                }
            }
            if(nums[i] == 0) {
                while(zero <= two && nums[zero] == 0)
                    ++zero;
                if(i > zero) {
                    swap(nums[i], nums[zero]);
                    ++zero;
                }
                // 本来前缀就是多个0情况，直接把i改为zero - 1。
                else i = zero - 1;
            }
            //如果全是0 或者2 加入条件才是一次遍历
            if(two <= zero)
                break;
        }
    }
};

