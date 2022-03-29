 class Solution 
{
public:
   int XXX(string s) 
	{
		vector<int>vecVis(256, -1);
		int res{ 0 };
		int startPos{ 0 }, curPos{ 0 };
		for (auto iter : s)
		{
			if (vecVis[iter] >= 0 && vecVis[iter]>= startPos)
			{
				res = max(res, curPos - startPos);
				startPos = vecVis[iter] + 1;
			}
			vecVis[iter] = curPos++;
		}
		return max(res, curPos - startPos);
	}

};

