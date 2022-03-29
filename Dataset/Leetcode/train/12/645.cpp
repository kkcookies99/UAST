 class Solution {
public:
    string XXX(int num) {
		string ret;
		map<int, string> roma = { { 1,"I" }, { 4,"IV" }, { 5,"V" }, { 9,"IX" }, { 10,"X" },{ 40,"XL" },
		{ 50,"L" }, { 90,"XC" }, { 100,"C" }, { 400,"CD" }, { 500,"D" }, { 900,"CM" }, { 1000,"M" } };
		auto iter = roma.rbegin();
		while (iter != roma.rend()) {
			while (num >= iter->first) {
				num -= iter->first;
				ret += iter->second;
			}
			iter++;
		}
		return ret;
	}
};

