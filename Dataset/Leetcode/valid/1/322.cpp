 vector<int> XXX(vector<int>& nums, int target) {
	//建表 value : index
	map<int, vector<int>> hash;
	for (int i = 0; i < nums.size(); i++) {
		hash[nums[i]].push_back(i);
	}

	vector<int> v;
	for (auto n : nums) {
		int need = target - n;
		if(hash.find(need) == hash.end())
			continue;

		//相同val
		if (need == n) {
			if (hash[n].size() < 2)
				continue;
			else {
				v.push_back(hash[n][0]);
				v.push_back(hash[n][1]);
				break;
			}
		}
		//不同val
		v.push_back(hash[n][0]);
		v.push_back(hash[need][0]);
		break;
	}
	return v;
}

