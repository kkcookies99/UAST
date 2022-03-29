 class Solution {
public:
	int singleNumber(vector<int>& nums) {
		if (nums.size() <= 0) {
			return -1;
		}
		map<int,int> imap;
		for (int i = 0; i < nums.size(); i++) {
			if(imap.find(nums[i])==imap.end()){//如果没找到
				imap.insert(make_pair(nums[i],1));
			}
			else
			{
				++imap[nums[i]];
			}
		}
		for (map<int, int>::iterator it = imap.begin(); it != imap.end(); it++) {
			if ((*it).second == 1) {
				return (*it).first;
			}
		}
		return -1;
	}
};

