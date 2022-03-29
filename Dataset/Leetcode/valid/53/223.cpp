class Solution {
public:
    int XXX(vector<int>& nums) {
        return XXX(nums, 0, nums.size()-1)[2];
    }
    vector<int> XXX(vector<int>& nums, int low, int high)
    {
        if (low == high) return {low, high, nums[low]};
        else
        { 
            int mid = (low + high) / 2;
            vector<int> left = XXX(nums, low, mid);
            vector<int> right = XXX(nums, mid + 1, high);
            vector<int> cross = maxCrossingSubArray(nums, low, mid, high);
            if (left[2] >= right[2] && left[2] >= cross[2]) return left;
            else if (right[2] >= left[2] && right[2] >= cross[2]) return right;
            else return cross;
        } 
    }
    vector<int> maxCrossingSubArray(vector<int>& nums, int low, int mid, int high)
    {
        int left_sum = INT_MIN, right_sum = INT_MIN, sum = 0, max_left, max_right;
        for (int i = mid; i >= low; i--)
        {
            sum += nums[i];
            if (sum > left_sum)
            {
                left_sum = sum;
                max_left = i;
            }
        }
        sum = 0;
        for (int i = mid + 1; i <= high; i++)
        {
            sum += nums[i];
            if (sum > right_sum)
            {
                right_sum = sum;
                max_right = i;
            }
        }
        return {max_left, max_right, left_sum + right_sum};
    }
};

