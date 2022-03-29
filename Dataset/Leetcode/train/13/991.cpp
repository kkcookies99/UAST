 class Solution {
public:
	int XXX(string s) {
		int ans = 0;
		unordered_map<int, int>hash = {
		   {'M',1000},{'D',500},{'C',100},{'L',50},{'X',10},{'V',5},{'I',1}
		};
		int pos = hash.find(s[0])->second;
		for (auto i : s)
		{
			int temp = (hash.find(i))->second;
			if (temp > pos)ans -= (2 * pos);
			ans += temp;
			pos = temp;
		}
		return ans;
	}
};

