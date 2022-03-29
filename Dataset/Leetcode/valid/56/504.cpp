 class Solution {
public:
   vector<vector<int>> XXX(vector<vector<int>>& intervals) {
		sort(intervals.begin(), intervals.end());
		auto it = intervals.begin();
		while (it < intervals.end() - 1) {
			vector<vector<int>>::iterator next = it + 1;
			if (it[0][1] >= next[0][0]) {
				if (it[0][1] < next[0][1]) {
					it[0][1] = next[0][1];
				}
				intervals.erase(next);
				continue;
			}
			++it;
		}
		return intervals;
   }
};

