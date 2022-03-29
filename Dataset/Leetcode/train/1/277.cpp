 vector<int> XXX(vector<int>& nums, int target) {

	vector<int> indices;

	// 异常测试：数组元素个数为0或1，返回空数组
	if (nums.size() == 0 || nums.size() == 1)
		return indices;

	// 使用散列表来实现两数之和，时间复杂度为O(n)，空间复杂度为O(n)
	unordered_map<int, int> hashTable;

	for (int i = 0; i < nums.size(); i++) {
		if (hashTable.find(target - nums[i]) != hashTable.end()) {
			indices.push_back(hashTable.find(target - nums[i])->second);
			indices.push_back(i);
			return indices;
		}
		hashTable.insert(make_pair(nums[i], i));
	}

	// 不存在两数之和等于目标值，返回空数组
	return indices;
}

