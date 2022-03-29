class Solution {
public:
    void XXX(vector<int>& nums) {
        // 荷兰国旗问题        
        int begin = 0, current = 0, end = nums.size() - 1;
        while (current <= end){
            if (nums[current] == 0){
                swap(nums[current++], nums[begin++]);
            }
            else if (nums[current] == 2){
                swap(nums[current], nums[end--]);
            }
            else {
                current++;
            }
        }
    }
};

