 class Solution {
public:
    int XXX(vector<int>& nums, int target) 
    {
	if(target - nums.back() > 0)	return nums.size();
	if(target - nums[0] <= 0)	return 0;
        for(int i = 0; i < nums.size() -1; i++)
	{
		if((target-nums[i])*(nums[i+1]-target) == 0)
			return i;
		else if( (target > nums[i] && nums[i+1] > target) || (nums[i+1] == target))
			return i+1;
	}
    }
};

