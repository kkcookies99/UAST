class Solution {
public:
    void XXX(vector<int>& nums) {
        int p = 0, q = nums.size() - 1;
        for(int i = 0; i <= q; ++i){
            //由于2交换过后还可能等于2或者0
            while(nums[i] == 2 && i <= q){
                swap(nums[i], nums[q]);
                --q;
            }
            if(nums[i] == 0){
                swap(nums[i], nums[p]);
                ++p;
            }
        }
        return;
    }
};

