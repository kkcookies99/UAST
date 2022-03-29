 class Solution {
public:
	vector<vector<int>> XXX(vector<vector<int>>& intervals) {
		sort(intervals.begin(),intervals.end());
		vector<vector<int>> ans;
		
		for (int i = 0; i < intervals.size(); i++) {
			if (ans.empty() || ans.back()[1] < intervals[i][0]) {
				ans.push_back(intervals[i]);
			}
			else if(ans.back()[1]>=intervals[i][0])
			{
				int temp = max(ans.back()[1],intervals[i][1]);
				ans.back()[1] = temp;
			}
			else
			{

			}

		}		
		return ans;
	}
};

