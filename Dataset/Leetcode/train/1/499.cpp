 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
		vector<int> res;
		//使用哈希表保存整数与其对应的下标
		unordered_map<int, int> map;
		
		//开始遍历并将元素保存到哈希表中，并检查和为target的另一个元素是否已经保存在hash表中
		int len = nums.size();
		for (int i = 0; i < len; ++i)
		{
			int cur = nums[i];
			//检查是否已经存在与当前元素的和恰好为target的元素，若存在，则直接返回
			if (map.find(target - cur) != map.end())
			{
				res.push_back(map[target - cur]);
				res.push_back(i);
				break;
			}
			//将元素保存到hash表中
			map[cur] = i;
		}
		return res;
    }
};

