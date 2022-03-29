class Solution {
public:
    void XXX(vector<int>& nums) {

        int i = 0, j = nums.size() - 1;
        for(int k = i ; k <= j ; k ++){
            if(nums[k] == 0)
                swap(nums[i ++], nums[k]);
            else if(nums[k] == 2)
                swap(nums[k --], nums[j --]);
        }
    }
};

