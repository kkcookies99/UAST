 class Solution {
public:
	string XXX(vector<string>& strs) {
		auto minStr{ min_element(strs.begin(),strs.end(),[](string& s1,string& s2) {return s1.size() < s2.size(); }) };
		size_t minLen{ minStr->size() };
		string ans; char ch;
		for (size_t i{}; i < minLen; ++i)
		{
			ch = minStr->operator[](i);
			if (any_of(strs.begin(), strs.end(), [&minLen, &i, &ch](string& s) {
				return s[i] != ch; }))
				return ans;
			ans += ch;
		}
		return ans;
	}
};

