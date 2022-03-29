 class Solution {
public:
	vector<int> XXX(vector<int>& nums, int target)
	{
		map<int, int>numMap;
		for (int i = 0; i < nums.size();++i)
		{
			numMap.insert({ nums[i], i });
		}
		for (int i = 0; i < nums.size(); ++i)
		{
			map<int, int>::iterator itr = numMap.find(target - nums[i]);
			if ((itr!=numMap.end())&&(itr->second!=i))
			{
				return (itr->second>i ? vector<int>{i, itr->second} : vector<int>{ itr->second, i });
			}
		}
		return vector<int>{};
	}
};

