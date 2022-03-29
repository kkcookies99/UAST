class Solution {
public:
    void XXX(vector<int>& nums) {
        int ptr_0 = 0, ptr_2 = nums.size() - 1;
        // [1]
        // int i;
        // for(i = 0; i < nums.size(); i++){
        //     if(nums[i] == 0)
        //         swap(nums[i], nums[ptr_0++]);
        // }
        // for(i = ptr_0; i < nums.size(); i++){
        //     if(nums[i] == 1)
        //         swap(nums[i], nums[ptr_0++]);
        // }
        // [2]
        for(int i = 0 ; i < nums.size(); i++){
            while(nums[i] == 2 && i < ptr_2)
                swap(nums[i], nums[ptr_2--]);
            if(nums[i] == 0)
                swap(nums[i], nums[ptr_0++]);
        }
    }
};

