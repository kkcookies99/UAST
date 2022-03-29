 class Solution {
public:
    int singleNumber(vector<int>& nums) {
	unordered_set<int> ss;
	for (auto a:nums) {
		if (!ss.count(a)) {
			ss.insert(a);
		}
		else
		{
			ss.erase(a);
		}
	}
	return *ss.begin();
}
};

