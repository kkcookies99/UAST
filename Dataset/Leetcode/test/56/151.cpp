 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        // 异常判断
	if (intervals.empty())
		return intervals;

	// 对区间的第一列进行从小到大排序，即保证每个区间的起始值递增
	sort(intervals.begin(), intervals.end());

	vector<vector<int>> result;
	
	// 将第一个区间压入
	result.push_back(intervals[0]);

	for (size_t i = 1; i < intervals.size(); i++)
	{
		// result.back()表示result容器里的最后一个区间，result.back().back()表示这个区间的最后一个值
		// 如果已经压入result容器内最后一个区间的末端值小于要压入的区间的起始值
		if (result.back().back() < intervals[i].front())
			result.push_back(intervals[i]);
		// 如果已经压入result容器内最后一个区间的末端大于等于要压入的区间的起始值，则新压入的区间末端由这两个区间的最大末端所决定
		else
			result.back().back() = max(result.back().back(), intervals[i].back());
	}

	return result;
    }
};

