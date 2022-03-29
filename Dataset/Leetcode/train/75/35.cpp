class Solution {
public:
    void XXX(vector<int>& nums) {
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0)j++;
            else if(nums[i] == 1)k++;
        }

        for(int i = 0; i < nums.size(); i++){
            if(i < j)nums[i] = 0;
            else if(i < k + j ) nums[i] = 1;
            else nums[i] = 2;
        }
    }

};

