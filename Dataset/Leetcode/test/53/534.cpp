 class Solution {
public:
    int XXX(vector<int>& nums) {
        int max = nums[0];
        int temp = 0;
        if (nums[0] > 0)
            temp = nums[0];

        if (nums.size() == 1)
            return max;

        for (int i=1; i<nums.size(); i++){
            temp += nums[i];
            if (max < temp){
                max = temp;
            }
            if (temp < 0){
                temp = 0;
            }
            
        }

        return max;
    }
};

