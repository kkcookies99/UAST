 class Solution {
public:
	string XXX(int num) {
		string res;
		vector<pair<int, string>> myVec{ {1000, "M"}, {900, "CM"}, {500, "D"}, 
			{400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"},
			{9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"} };
		int n = myVec.size();
		while (num) {
			for (int i = 0; i < n; ++i) {
				if (num >= myVec[i].first) {
					res += myVec[i].second;
					num -= myVec[i].first;
					break;
				}
			}
		}
		return res;
	}
};

