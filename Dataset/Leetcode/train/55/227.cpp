class Solution {
public:
    bool XXX(vector<int>& nums) {
        int i = nums.size() - 2;
        while( i >= 0 ){
            if( nums[i] == 0 ){
                int k = 1;
                int j = i - 1;
                while( j >= 0 && nums[j] <= k ){
                    --j;
                    ++k;
                }
                if( j < 0 )
                    return false;
                else
                    i = j;
            }else{
                --i;
            }
        }
        return true;
    }
};

