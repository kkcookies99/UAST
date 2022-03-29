 class Solution {
public:
	vector<vector<int>> XXX(vector<vector<int>>& intervals) 
	{
		sort(intervals.begin(), intervals.end());
		vector<vector<int>> ans;
		ans.push_back({ intervals[0][0],intervals[0][1] });
		int j = 0,i=1;
		int n = intervals.size();
		while (i < n)
		{
			//区间有交集
			if (i<n&&ans[j][1] >= intervals[i][0]&&ans[j][0]<=intervals[i][1])
			{
				while (i < n&&ans[j][1] >= intervals[i][0] && ans[j][0] <= intervals[i][1])
				{
					int min, max;
					min = ans[j][0] < intervals[i][0] ? ans[j][0] : intervals[i][0];
					max = ans[j][1] > intervals[i][1] ? ans[j][1] : intervals[i][1];
					ans[j][0] = min;
					ans[j][1] = max;
					i++;
				}
			}
			//两个区间没有交集时
			else
			{
				ans.push_back({ intervals[i][0],intervals[i][1] });
				j++;
				i++;
			}
		}
		return ans;
	}
};

