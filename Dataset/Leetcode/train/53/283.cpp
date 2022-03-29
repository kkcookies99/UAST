class Solution {
public:
    int XXX(vector<int>& nums) {
        int max = nums[0], temp = 0;
        for(int i = 0; i < nums.size(); i++){
            temp = temp + nums[i];
            if(temp > max)
                max = temp;
            if(temp < 0)
                temp = 0;
        }
        return max;
    }
};

