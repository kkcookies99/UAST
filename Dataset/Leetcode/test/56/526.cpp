 class Solution {
public:
    static bool cmp1(vector<int>x, vector<int>y)
    {
	    return x[0] < y[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
	vector<int>c;
	sort(intervals.begin(), intervals.end(), cmp1);//定排序规则
	vector<vector<int>>a = { intervals[0] };
	for (int i = 1;i < intervals.size();i++)
	{
		c = intervals[i];
		if (a.back()[1] >= c[0])
		{
			if (a.back()[1] < c[1])
				a.back()[1] = c[1];
		}
		else
			a.push_back(c);
	}  
        return a;                          
    }
};

