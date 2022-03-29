 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        int len = nums.size();
        vector<int> temp = nums;
        sort(temp.begin(), temp.end());
        int left = 0, right = len - 1;
        vector<int> result(2);
        while(left<right)
        {
            if(temp[left] + temp[right] == target)
                break;
            if(temp[left] + temp[right] < target)
            {
                left++;
                continue;
            }
            right--;
        }
        int flag1 = 1;
        int flag2 = 1;
        for(int i = 0; i < len; i++)
        {
            if(nums[i] == temp[left] && flag1)
            {
                result[0] = i;
                flag1 = 0;
                continue;
            }
            if(nums[i] == temp[right] && flag2)
            {
                flag2 = 0;
                result[1] = i;
            }
        }
        //result[0] = temp[left];
        //result[1] = temp[right];
        return result;
    }
};

