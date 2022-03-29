 class Solution {
public:
	string XXX(vector<string>& strs) {
		int pos = 0;
		string ans = "";
		string temp = strs[0];
		while (pos < strs[0].size()){
			for (int i = 1; i < strs.size(); i++){
				if (strs[i][pos] != temp[pos] || !strs[i][pos]){
					return ans;
				}
			}
			ans += temp[pos++];
		}
		return ans;
	}
};

