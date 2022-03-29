class Solution {
public:
    int XXX(vector<int>& nums) {
        return find(nums, 0, nums.size() - 1);
    }
      
    int find(vector<int>& nums, int start, int end) {
        // boundary
        if (start == end) {
            return nums[start];
        }
        if (start > end) {
            return INT_MIN;
        }
          
        // delcare
        int left_max = 0, right_max = 0, ml = 0, mr = 0;
        int middle = (start + end) / 2;
          
        // find
        left_max = find(nums, start, middle - 1);
        right_max = find(nums, middle + 1, end);
        // middle
        // to left
        for (int i = middle - 1, sum = 0; i >= start; --i) {
            sum += nums[i];
            if (ml < sum) ml = sum;
        }
        // to right
        for (int i = middle + 1, sum = 0; i <= end; ++i) {
            sum += nums[i];
            if (mr < sum) mr = sum;
        }
          
        // return
        return max(max(left_max, right_max), ml + mr + nums[middle]);
    }
};

